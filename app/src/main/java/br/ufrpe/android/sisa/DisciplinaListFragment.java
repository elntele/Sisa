package br.ufrpe.android.sisa;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by jorge on 24/06/2017.
 */

public class DisciplinaListFragment extends ListFragment {
    private ArrayList<Disciplina> mDisciplinas;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.disciplina_titulo);
        mDisciplinas = DisciplinaLab.getInstance(getActivity()).getDisciplinas();

        ArrayAdapter<Disciplina> adapter =new ArrayAdapter<Disciplina>(getActivity(),
                        android.R.layout.simple_list_item_1,mDisciplinas);
        setListAdapter(adapter);
    }


}
