package br.ufrpe.android.sisa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
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

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_disciplina_list, container, false);

        mDisciplinaRecyclerView = (RecyclerView) v.findViewById(R.id.disciplina_recycler_view);
        mDisciplinaRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return v;
    }

    private void updateUI(){

        DisciplinaLab disciplinaLab = DisciplinaLab.getInstance(getActivity());
        List<Disciplina> disciplinas = disciplinaLab.getDisciplinas();

        mAdapter = new DisciplinaAdapter(disciplinas);
        mDisciplinaRecyclerView.setAdapter(mAdapter);
    }

    private class DisciplinaHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mCodigoTextView;
        private TextView mNomeTextView;
        private Disciplina mDisciplina;

        public DisciplinaHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.list_item_disciplina, parent, false));
            itemView.setOnClickListener(this);

            mCodigoTextView = (TextView) itemView.findViewById(R.id.codigo_disciplina_list);
            mNomeTextView = (TextView) itemView.findViewById(R.id.nome_disciplina_list);

        }

        public void bind (Disciplina disciplina){
            mDisciplina = disciplina;
            mCodigoTextView.setText(mDisciplina.getCodigo());
            mNomeTextView.setText(mDisciplina.getNome());
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(getActivity(), mDisciplina.getNome() + " clicada!", Toast.LENGTH_SHORT).show();
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
    }
}
