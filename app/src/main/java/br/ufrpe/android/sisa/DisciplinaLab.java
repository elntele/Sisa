package br.ufrpe.android.sisa;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by jorge on 24/06/2017.
 * esta classe é um sigleton para mistra uma lista de disciplinas
 */

public class DisciplinaLab {
    private static DisciplinaLab sDisciplinaLab;
    private Context mAppContext;
    private ArrayList<Disciplina> mDisciplinas;

    private DisciplinaLab(Context appContext) {
        mAppContext = appContext;
        mDisciplinas=new ArrayList<Disciplina>();
        for (int i=1;i<66;i++){
            Disciplina d=new Disciplina();
            d.setNome("disciplina numero "+i);
            d.setSolved(false);
            d.setCodigo(Integer.toString(i));
            mDisciplinas.add(d);
        }
    }

    public ArrayList<Disciplina> getDisciplinas(){
        return mDisciplinas;
    }


    public Disciplina getDisciplina(UUID id){
        for (Disciplina d: mDisciplinas){
            if (d.getId().equals(id)){
                return d;
            }
        }
        return null;
    }




    static DisciplinaLab getInstance(Context c) {
        if (sDisciplinaLab == null) {
            sDisciplinaLab = new DisciplinaLab(c.getApplicationContext());
        }
        return sDisciplinaLab;
    }
}
