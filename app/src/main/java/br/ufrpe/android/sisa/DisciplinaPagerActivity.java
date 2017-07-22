package br.ufrpe.android.sisa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.List;
import java.util.UUID;

/**
 * Created by LENOVO on 22/07/2017 Aula 11.
 */

public class DisciplinaPagerActivity extends AppCompatActivity {

    private static final String EXTRA_DISCIPLINA_ID = "br.ufrpe.android.sisa.disciplina_id";
    private ViewPager mViewPager;
    private List<Disciplina> mDisciplinas;

    public static Intent newIntent(Context packageContext, UUID disciplinaId){

        Intent intent = new Intent(packageContext, DisciplinaPagerActivity.class);
        intent.putExtra(EXTRA_DISCIPLINA_ID, disciplinaId);
        return intent;
    }

    @Override
    public void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_disciplina_pager);

        UUID disciplinaId = (UUID) getIntent().getSerializableExtra(EXTRA_DISCIPLINA_ID);

        mViewPager = (ViewPager) findViewById(R.id.disciplina_view_pager);
        mDisciplinas = DisciplinaLab.getInstance(this).getDisciplinas();
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {

            @Override
            public Fragment getItem(int position) {
                Disciplina disciplina = mDisciplinas.get(position);
                return DisciplinaFragment.newInstance(disciplina.getId());
            }

            @Override
            public int getCount() {
                return mDisciplinas.size();
            }
        });

        for (int i = 0; i < mDisciplinas.size(); i++){
            if (mDisciplinas.get(i).getId().equals(disciplinaId)){
                mViewPager.setCurrentItem(i);
                break;
            }
        }
    }
}
