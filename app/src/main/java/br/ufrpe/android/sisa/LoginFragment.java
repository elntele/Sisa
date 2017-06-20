package br.ufrpe.android.sisa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jorge on 15/06/2017.
 */

public class LoginFragment extends Fragment{


    private EditText mEmail;
    private EditText mSenha;
    private Button mBtLogar;
    private Button mBtCadastrar;

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_login, parent, false);

        mEmail = (EditText) view.findViewById(R.id.email_edit_text);
        mSenha = (EditText) view.findViewById(R.id.senha_edit_text);

        mBtLogar = (Button) view.findViewById(R.id.login_button);
        mBtCadastrar = (Button) view.findViewById(R.id.cadastro_button);
        mBtCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui deve conter o código que quando acionar o botão cadastrar ele deverá ir para tela de cadastro.
            }
        });
        return view;
    }

}
