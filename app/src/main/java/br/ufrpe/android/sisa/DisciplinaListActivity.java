package br.ufrpe.android.sisa;

import android.support.v4.app.Fragment;

/**
 * Created by jorge on 24/06/2017.
 */

public class DisciplinaListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new  DisciplinaListFragment();
    }
}
