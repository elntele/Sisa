package br.ufrpe.android.sisa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jorge on 15/06/2017.
 */

public class LoginActivity extends AppCompatActivity{


    private EditText mEmail;
    private EditText mSenha;
    private Button mBtLogar;
    private Button mBtCadastrar;

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_login);

        mEmail = (EditText) findViewById(R.id.email_edit_text);
        mSenha = (EditText) findViewById(R.id.senha_edit_text);
        mBtLogar = (Button) findViewById(R.id.login_button);
        mBtCadastrar = (Button) findViewById(R.id.cadastro_button);
        mBtCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui deve conter o código que quando acionar o botão cadastrar ele deverá ir para tela de cadastro.
                Intent intent = new Intent(LoginActivity.this, CadastroAlunoActivity.class);
                startActivity(intent);
            }
        });

    }

}
