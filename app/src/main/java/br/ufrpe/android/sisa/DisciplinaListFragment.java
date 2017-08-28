package br.ufrpe.android.sisa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jorge on 24/06/2017.
 */

public class DisciplinaListFragment extends Fragment{

    private RecyclerView mDisciplinaRecyclerView;
    private DisciplinaAdapter mAdapter;
    private Aluno mAluno;
    private Button mBotaoSalvar;

    public void setAluno(Aluno aluno) {
        mAluno = aluno;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_disciplina_list, container, false);

        mDisciplinaRecyclerView = (RecyclerView) v.findViewById(R.id.disciplina_recycler_view);
        mDisciplinaRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return v;
    }

    @Override
    public void onResume(){
        super.onResume();
        updateUI();
    }

    private void updateUI(){

        DisciplinaLab disciplinaLab = DisciplinaLab.getInstance(getActivity());
        List<Disciplina> disciplinas = disciplinaLab.getDisciplinas();

        if (mAdapter == null) {
            mAdapter = new DisciplinaAdapter(disciplinas);
            mDisciplinaRecyclerView.setAdapter(mAdapter);
        }else {
            mAdapter.setdisciplinas(disciplinas);
            mAdapter.notifyDataSetChanged();
        }
    }

    private class DisciplinaHolder extends RecyclerView.ViewHolder implements OnClickListener{

        private TextView mCodigoTextView;
        private TextView mNomeTextView;
        private ImageView mDoneImageView;
        private Disciplina mDisciplina;

        public DisciplinaHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.list_item_disciplina, parent, false));
            itemView.setOnClickListener(this);

            mCodigoTextView = (TextView) itemView.findViewById(R.id.codigo_disciplina_list);
            mNomeTextView = (TextView) itemView.findViewById(R.id.nome_disciplina_list);
            mDoneImageView=(ImageView) itemView.findViewById(R.id.image_done);

        }
        // metodo que confere se a disciplina esta tickada.
        public void bind (Disciplina disciplina){
            mDisciplina = disciplina;
            mCodigoTextView.setText(mDisciplina.getCodigo());
            mNomeTextView.setText(mDisciplina.getNome());
            mDoneImageView.setVisibility(disciplina.isCursada()? View.VISIBLE:View.GONE);

        }

        @Override
        public void onClick(View v) {
            Intent intent = DisciplinaPagerActivity.newIntent(getActivity(), mDisciplina.getId()); //Incluído na aula 11 PagerView
            intent.putExtra("aluno",mAluno);
            startActivity(intent);
        }





    }

    private class DisciplinaAdapter extends RecyclerView.Adapter<DisciplinaHolder>{

        private List<Disciplina> mDisciplinas;

        public DisciplinaAdapter(List<Disciplina> disciplinas){
            mDisciplinas = disciplinas;
        }

        @Override
        public DisciplinaHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new DisciplinaHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(DisciplinaHolder holder, int position) {

            Disciplina disciplina = mDisciplinas.get(position);
            holder.bind(disciplina);
        }

        @Override
        public int getItemCount() {
            return mDisciplinas.size();
        }

        public void setdisciplinas(List<Disciplina> disciplinas) {
            mDisciplinas=disciplinas;
        }
        // adicionado para pegar as disciplinas do adapter
        public List<Disciplina> getDisciplinas(){
            return mDisciplinas;
        }
    }


}
