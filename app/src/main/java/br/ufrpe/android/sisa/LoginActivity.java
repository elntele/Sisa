package br.ufrpe.android.sisa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by jorge on 15/06/2017.
 */

public class LoginActivity extends AppCompatActivity{

    private ConsultaAoBanco mconsuta;
    private Aluno mAluno;
    private ArrayList<Aluno> mListDeAlunos=new ArrayList<>();




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
        mBtLogar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                mconsuta=  ConsultaAoBanco.getInstance(getApplicationContext());
                mListDeAlunos= (ArrayList<Aluno>) mconsuta.getAlunos();
                for (Aluno A: mListDeAlunos){
                    if (A.getEmail().equals(mEmail.getText().toString())){
                        if (A.getSenha().equals(mSenha.getText().toString())){
                            Intent intent = new Intent(LoginActivity.this, TelaInicialActivity.class);
                            intent.putExtra("id",A.getId());
                            startActivity(intent);
                        }
                    } else {
                        Toast.makeText(getApplication(), "usuário e senha inválido, insira um usuário válido ou cadastre-se ",
                                Toast.LENGTH_SHORT).show();

                    }
                }
                Toast.makeText(getApplication(), "usuário e senha inválido, insira um usuário válido ou cadastre-se ",
                        Toast.LENGTH_SHORT).show();

            }
        });

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
