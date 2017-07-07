package br.ufrpe.android.sisa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import java.util.UUID;

/**
 * Created by LENOVO on 05/07/2017.
 */

public class DisciplinaActivity extends SingleFragmentActivity{

    public static final  String EXTRA_DISCIPLINA_ID=
            "com.bignerdranch.android.crimenalintent.crime_id";

    public static Intent newIntent(Context packageContext, UUID disciplinaId){
        Intent intent = new Intent( packageContext,DisciplinaActivity.class);
        intent.putExtra(EXTRA_DISCIPLINA_ID,disciplinaId);

        return intent;
    }


    @Override
    protected Fragment createFragment() {
        return new DisciplinaFragment();
    }
}
