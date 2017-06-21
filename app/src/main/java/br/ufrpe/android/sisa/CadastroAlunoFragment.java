package br.ufrpe.android.sisa;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CadastroAlunoFragment extends Fragment {

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
    private TextView mInformacaoDeliseTela;
    public CadastroAlunoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cadastro_aluno, container, false);

        mNome = (EditText) view.findViewById(R.id.nome_edit_text);
        mCPF = (EditText) view.findViewById(R.id.cpf_edit_text);
        mSenha = (EditText) view.findViewById(R.id.cpf_edit_text);
        mEmail = (EditText) view.findViewById(R.id.email_edit_text);
        mAnoPeriodoIngresso = (EditText) view.findViewById(R.id.ano_periodo_edit_text);
        mAreaPreferenciaFC = (CheckBox) view.findViewById(R.id.box_fc_check_box);
        mAreaPreferenciaARQ = (CheckBox) view.findViewById(R.id.box_arq_check_box);
        mAreaPreferenciaEnsiso = (CheckBox) view.findViewById(R.id.box_ensiso_check_box);
        mQtdPeriodosTrancados = (EditText) view.findViewById(R.id.periodo_tracando_edit_text);
        mHorasEstudoExtraClasse = (EditText) view.findViewById(R.id.qts_h_semanal_edit_text);
        mEscolhaAreaDePreferencia=(TextView) view.findViewById(R.id.area_preferencia_text_view);
        mInformacaoDeliseTela=(TextView) view.findViewById(R.id.deslise_tela_text_view);

        return view;
    }

}
