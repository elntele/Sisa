package br.ufrpe.android.sisa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/**
 * Created by LENOVO on 05/07/2017.
 */

public class DisciplinaFragment extends Fragment {

    private Disciplina mDisciplina;
    private CheckBox mCursadaCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        mDisciplina = new Disciplina();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_disciplina, container, false);


        mCursadaCheckBox = (CheckBox)v.findViewById(R.id.is_cursada_disciplina);
        mCursadaCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                mDisciplina.setCursada(isChecked);
            }
        });
        return v;
    }
}
