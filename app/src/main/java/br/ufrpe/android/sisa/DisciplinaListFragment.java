package br.ufrpe.android.sisa;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jorge on 24/06/2017.
 */

public class DisciplinaListFragment extends ListFragment {
    private ArrayList<Disciplina> mDisciplinas;
    private static final String TAG = "DisciplinaListFragment";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.disciplina_titulo);
        mDisciplinas = DisciplinaLab.getInstance(getActivity()).getDisciplinas();

        DisciplinaAdapter adapter = new DisciplinaAdapter(mDisciplinas);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
      //  Disciplina d = (Disciplina) (getListAdapter()).getItem(position);
        Disciplina d = ((DisciplinaAdapter)getListAdapter()).getItem(position);
        Log.d(TAG, d.getNome() + " foi clicado");
    }

    private class DisciplinaAdapter extends ArrayAdapter<Disciplina>{

        public DisciplinaAdapter(ArrayList<Disciplina> disciplinas){
            super(getActivity(), 0, disciplinas);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){

            if (convertView == null){
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_disciplina, null);
            }

            Disciplina d = getItem(position);

            TextView mCodigo = (TextView) convertView.findViewById(R.id.disciplina_list_codigo_text_view);
            mCodigo.setText(d.getCodigo());

            TextView mNome = (TextView) convertView.findViewById(R.id.disciplina_list_nome_text_view);
            mNome.setText(d.getNome());

            CheckBox mEscolhida = (CheckBox) convertView.findViewById(R.id.disciplina_list_escolhida_check_box);
            mEscolhida.setChecked(d.isSolved());

            return convertView;
        }
    }

}
