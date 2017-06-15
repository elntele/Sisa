package br.ufrpe.android.sisa;

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


    public EditText mEmailField;
    public EditText mPasswordField;
    public Button mButtonSignIn;
    public Button mButtonGetOut;

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle saveInstanceState){
        View v = inflater.inflate(R.layout.fragment_login, parent, false);

        mEmailField = (EditText) v.findViewById(R.id.email_edit_text);
        mPasswordField = (EditText) v.findViewById(R.id.password_edit_text);
        mButtonSignIn = (Button) v.findViewById(R.id.sign_in_button);
        mButtonGetOut = (Button) v.findViewById(R.id.get_out_button);
        return v;
    }

}
