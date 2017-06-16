package br.ufrpe.android.sisa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by LENOVO on 15/06/2017.
 */

public class LoginActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        //parte do código onde o new LoginFragment que é uma nova instacia de Login fragmente
        //é colocada dentri do activity_login.... em LoginFragmente é inflado o fragment_login.xml
        //e aqui ele é cologado dentro do conteiner
        if (fragment == null){
            fragment = new LoginFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
