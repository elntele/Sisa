package br.ufrpe.android.sisa;

import android.support.v4.app.Fragment;


/**
 * Created by jorge on 24/06/2017.
 */

public class DisciplinaListActivity extends SingleFragmentActivity {
   private Aluno aluno; // adicionado

   @Override
    protected Fragment createFragment() {
       this.aluno = (Aluno) getIntent().getSerializableExtra("aluno");
       DisciplinaListFragment fragment = new DisciplinaListFragment();
       fragment.setAluno(this.aluno);
       return fragment;

    }


}
