package br.ufrpe.android.sisa;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        ArrayAdapter<Disciplina> adapter =new ArrayAdapter<Disciplina>(getActivity(),
                        android.R.layout.simple_list_item_1,mDisciplinas);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Disciplina d = (Disciplina) (getListAdapter()).getItem(position);
        Log.d(TAG, d.getNome() + " foi clicado");
    }


}
