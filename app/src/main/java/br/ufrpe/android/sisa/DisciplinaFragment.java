package br.ufrpe.android.sisa;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.ufrpe.android.sisa.database.AlunoBaseHelper;
import br.ufrpe.android.sisa.database.SisaDbSchema;

/**
 * Created by LENOVO on 05/07/2017.
 */

public class DisciplinaFragment extends Fragment {

    private Disciplina mDisciplina;
    private CheckBox mCursadaCheckBox;
    private TextView mNomeTextView;
    private TextView mCodigoTextView;
    private TextView mAreaTextView;
    private Aluno mAluno;
    private Button mBotao;
    private Context mContext;// add para o banco
    private SQLiteDatabase mDatabase; // add para o banco


    //  private FloatingActionButton mFloatingActionButton;
    private Button mSalvarButton;
    private static final String ARG_DISCIPLINA_ID = "disciplina_id";

    public static DisciplinaFragment newInstance (UUID disciplinaId){// adicionado o aluno

        Bundle args = new Bundle();
        args.putSerializable(ARG_DISCIPLINA_ID,disciplinaId);
        DisciplinaFragment fragment = new DisciplinaFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public void setAluno(Aluno aluno){
        mAluno=aluno;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        UUID disciplinaId = (UUID) getArguments().getSerializable(ARG_DISCIPLINA_ID);
        mDisciplina = DisciplinaLab.getInstance(getActivity()).getDisciplina(disciplinaId);
    }

    @Override
    public void onPause() {
        super.onPause();
        DisciplinaLab.getInstance(getActivity())
                .updateDisciplina(mDisciplina);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_disciplina, container, false);

        mNomeTextView = (TextView) v.findViewById(R.id.nome_disciplina);
        mNomeTextView.setText(mDisciplina.getNome());

        mCodigoTextView = (TextView) v.findViewById(R.id.codigo_disciplina);
        mCodigoTextView.setText(mDisciplina.getCodigo());

        mAreaTextView = (TextView) v.findViewById(R.id.area_disciplina);
        mAreaTextView.setText(mDisciplina.getArea());

        mCursadaCheckBox = (CheckBox)v.findViewById(R.id.is_cursada_disciplina);
        mCursadaCheckBox.setChecked(mDisciplina.isCursada());
        mCursadaCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ArrayList<Disciplina> Dis;
                mDisciplina.setCursada(isChecked);
                if (mDisciplina.isCursada()){
                    Dis= mAluno.getCursadas();
                    Dis.add(mDisciplina);
                    mAluno.setCursadas(Dis);
                }

            }
        });



        mBotao = (Button) v.findViewById(R.id.salvar_button);
        mBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Exemplo Toast", Toast.LENGTH_SHORT).show();
              //  mDatabase = new AlunoBaseHelper(mContext)// adicionado para a tabela aluno
                //        .getWritableDatabase();
                inicia();
                addAluno();
                Intent intent = new Intent(getActivity(),TelaInicialActivity.class);
                startActivity(intent);
            }
        });




     //   mFloatingActionButton = (FloatingActionButton) v.findViewById(R.id.cadastro_fab);
         // mSalvarButton = (Button) v.findViewById(R.id.salvar_button);

        return v;
    }


    private static ContentValues getContentValues(Aluno aluno) {
        ContentValues values = new ContentValues();
        values.put(SisaDbSchema.AlunoTable.Cols.ID, aluno.getId().toString());
        values.put(SisaDbSchema.AlunoTable.Cols.NOME, aluno.getNome());
        values.put(SisaDbSchema.AlunoTable.Cols.EMAIL, aluno.getEmail());
        values.put(SisaDbSchema.AlunoTable.Cols.SENHA, aluno.getSenha());
        values.put(SisaDbSchema.AlunoTable.Cols.CPF, aluno.getCpf());

       // SharedPreferences mPrefs = null; // esse null foi adaptado
       // SharedPreferences.Editor prefsEditor = mPrefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(aluno.getCursadas() );
       // prefsEditor.putString("", json);
       // prefsEditor.commit();

        values.put(SisaDbSchema.AlunoTable.Cols.CURSADAS, json);
        values.put(SisaDbSchema.AlunoTable.Cols.AREA, aluno.getArea());
        values.put(SisaDbSchema.AlunoTable.Cols.ANODEINGRESSO, aluno.getAndoDeIngresso());
        values.put(SisaDbSchema.AlunoTable.Cols.PERIODODEINGRESSO, aluno.getPeriodoDeIngresso());
        values.put(SisaDbSchema.AlunoTable.Cols.QTDDEPERIODOSTRANCADOS, aluno.getQtdDePeriodosTrancado());
        return values;
    }

    public void inicia(){
        mContext = getContext().getApplicationContext();
        mDatabase = new AlunoBaseHelper(mContext)// adicionado para a tabela aluno
                .getWritableDatabase();
    }
    public void addAluno(){

        ContentValues values = getContentValues(mAluno);
        mDatabase.insert(SisaDbSchema.AlunoTable.NAME, null, values);

    }
}
