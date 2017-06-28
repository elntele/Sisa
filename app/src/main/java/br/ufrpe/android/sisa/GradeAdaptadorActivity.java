package br.ufrpe.android.sisa;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jorge on 27/06/2017.
 */

public class GradeAdaptadorActivity extends BaseAdapter {
    private Context mContext;
   // private ArrayList<Disciplina> mDisciplinas;
    int [] desenho;

    public GradeAdaptadorActivity(Context c,  int Desendo[]/*ArrayList<Disciplina> D*/){
        this.mContext=c;
       // this .mDisciplinas=D;
        this.desenho=Desendo;
    }



    @Override
    public int getCount() {
        //return mDisciplinas.size();
        return desenho.length;
    }

    @Override
    public Object getItem(int position) {
        //return mDisciplinas.get(position);
        return desenho[position];
    }

    @Override
    public long getItemId(int position) {
      //tradado de qualquer kjeito pra não ter que tratar conversão de id
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // TextView mNome = (TextView) convertView.findViewById(R.id.grade_de_teste);
       // mNome.setText(mDisciplinas.get(position).getNome());
       // return mNome;
       ImageView iv = new ImageView(mContext);
        iv.setImageResource(desenho[position]);
        iv.setAdjustViewBounds(true);
        return iv;

    }
}
