package br.ufrpe.android.sisa;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CadastroAlunoActivity extends AppCompatActivity {

    private EditText mNome;
    private EditText mCPF;
    private EditText mSenha;
    private EditText mEmail;
    private EditText mAnoPeriodoIngresso;
    private CheckBox mAreaPreferenciaFC;
    private CheckBox mAreaPreferenciaEnsiso;
    private CheckBox mAreaPreferenciaARQ;
    private EditText mQtdPeriodosTrancados;
    private EditText mHorasEstudoExtraClasse;
    private TextView mEscolhaAreaDePreferencia;
    private Button mBtProximo;
    private Button mBtFoto;
    public CadastroAlunoActivity() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        mNome = (EditText) findViewById(R.id.nome_edit_text);
        mCPF = (EditText) findViewById(R.id.cpf_edit_text);
        mSenha = (EditText) findViewById(R.id.senha_edit_text);
        mEmail = (EditText) findViewById(R.id.email_edit_text);
        mAnoPeriodoIngresso = (EditText) findViewById(R.id.ano_periodo_edit_text);
        mAreaPreferenciaFC = (CheckBox) findViewById(R.id.box_fc_check_box);
        mAreaPreferenciaARQ = (CheckBox) findViewById(R.id.box_arq_check_box);
        mAreaPreferenciaEnsiso = (CheckBox) findViewById(R.id.box_ensiso_check_box);
        mQtdPeriodosTrancados = (EditText) findViewById(R.id.periodo_tracando_edit_text);
        mHorasEstudoExtraClasse = (EditText) findViewById(R.id.qts_h_semanal_edit_text);
        mEscolhaAreaDePreferencia=(TextView) findViewById(R.id.area_preferencia_text_view);
        mBtFoto = (Button) findViewById(R.id.tela_foto_button);
        mBtFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Aqui devemos implementar a chamada para a tela de tirar foto!
                Intent intent = new Intent(CadastroAlunoActivity.this, CapturaFotoActivity.class);
                startActivity(intent);
            }
        });


        mBtProximo = (Button) findViewById(R.id.proximo_button);
        mBtProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui deve conter o código que quando acionar o botão cadastrar ele deverá ir para tela de cadastro.
                if (mNome.equals("") || mCPF.equals("") ||
                        (!mAreaPreferenciaARQ.isChecked() && !mAreaPreferenciaEnsiso.isChecked() && !mAreaPreferenciaFC.isChecked())||
                        mAnoPeriodoIngresso.equals("")||mSenha.equals("")||mEmail.equals("")||mQtdPeriodosTrancados.equals("")||
                        mHorasEstudoExtraClasse.equals("")
                        ){
                    Toast.makeText(getApplicationContext(),"Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }else{
                    Aluno aluno= new Aluno();
                    aluno.setNome(mNome.getText().toString());
                    try {
                        aluno.setCpf(Integer.parseInt(mCPF.getText().toString()) );
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    try{}catch (Exception e){e.printStackTrace();}

                    try{
                        aluno.setQtdDePeriodosTrancado(Integer.parseInt(mQtdPeriodosTrancados.getText().toString()));
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    String Texto =mAnoPeriodoIngresso.getText().toString();
                    String TextoSeparado [] = Texto.split(".");
                    try{
                        aluno.setAndoDeIngresso(Integer.parseInt(TextoSeparado[0]) );
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    try{
                        aluno.setPeriodoDeIngresso(Integer.parseInt(TextoSeparado[1]));
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    aluno.setSenha(mSenha.getText().toString());
                    aluno.setEmail(mEmail.getText().toString());
                    if (mAreaPreferenciaARQ.isChecked()) aluno.setArea("ARQ");
                    if (mAreaPreferenciaFC.isChecked()) aluno.setArea("FC");
                    if (mAreaPreferenciaEnsiso.isChecked()) aluno.setArea("ENSISO");
                    Intent intent = new Intent(CadastroAlunoActivity.this, DisciplinaListActivity.class);
                    intent.putExtra("aluno",aluno);
                    startActivity(intent);
                }

            }
        });


    }

}
