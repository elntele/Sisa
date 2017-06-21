package br.ufrpe.android.sisa;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


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
    public CadastroAlunoActivity() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        mNome = (EditText) findViewById(R.id.nome_edit_text);
        mCPF = (EditText) findViewById(R.id.cpf_edit_text);
        mSenha = (EditText) findViewById(R.id.cpf_edit_text);
        mEmail = (EditText) findViewById(R.id.email_edit_text);
        mAnoPeriodoIngresso = (EditText) findViewById(R.id.ano_periodo_edit_text);
        mAreaPreferenciaFC = (CheckBox) findViewById(R.id.box_fc_check_box);
        mAreaPreferenciaARQ = (CheckBox) findViewById(R.id.box_arq_check_box);
        mAreaPreferenciaEnsiso = (CheckBox) findViewById(R.id.box_ensiso_check_box);
        mQtdPeriodosTrancados = (EditText) findViewById(R.id.periodo_tracando_edit_text);
        mHorasEstudoExtraClasse = (EditText) findViewById(R.id.qts_h_semanal_edit_text);
        mEscolhaAreaDePreferencia=(TextView) findViewById(R.id.area_preferencia_text_view);
        mBtProximo = (Button) findViewById(R.id.proximo_button);


    }

}
