package br.ufrpe.android.sisa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by LENOVO on 05/07/2017.
 */

public class DisciplinaActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new DisciplinaFragment();
    }
}
