package br.ufrpe.android.sisa;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.SeekBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class CadastroAlunoFragment extends Fragment {

    private EditText mNome;
    private EditText mCPF;
    private EditText mSenha;
    private EditText mEmail;
    private EditText mAnoPeriodoIngresso;
    private EditText mAreaPreferencia;
    private EditText mQtdPeriodosTrancados;
    private SeekBar mHorasEstudoExtraClasse;

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
        mAreaPreferencia = (EditText) view.findViewById(R.id.area_preferencia_edit_text);
        mQtdPeriodosTrancados = (EditText) view.findViewById(R.id.periodo_tracando_edit_text);
        mHorasEstudoExtraClasse = (SeekBar) view.findViewById(R.id.hora_estudo_seek_bar);

        return view;
    }

}
