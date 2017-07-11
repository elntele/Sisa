package br.ufrpe.android.sisa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.UUID;

/**
 * Created by LENOVO on 05/07/2017.
 */

public class DisciplinaFragment extends Fragment {

    private Disciplina mDisciplina;
    private CheckBox mCursadaCheckBox;
    private TextView mNomeTextView;
    private TextView mCodigoTextView;
    private TextView mAreaTextView;
    private static final String ARG_DISCIPLINA_ID = "disciplina_id";

    public static DisciplinaFragment newInstance (UUID disciplinaId){

        Bundle args = new Bundle();
        args.putSerializable(ARG_DISCIPLINA_ID,disciplinaId);
        DisciplinaFragment fragment = new DisciplinaFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        UUID disciplinaId = (UUID) getArguments().getSerializable(ARG_DISCIPLINA_ID);
        mDisciplina = DisciplinaLab.getInstance(getActivity()).getDisciplina(disciplinaId);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

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

                mDisciplina.setCursada(isChecked);
            }
        });
        return v;
    }
}
