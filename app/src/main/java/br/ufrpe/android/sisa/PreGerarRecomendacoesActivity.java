package br.ufrpe.android.sisa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class PreGerarRecomendacoesActivity extends AppCompatActivity {

 //   private QuickContactBadge mQuickContactBadge;
    private ProgressBar mProgressBar;
    private TextView mMensagemTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_gerar_recomendacoes);

     //   mQuickContactBadge = (QuickContactBadge) findViewById(R.id.sisa_quickContactBadge);
        mProgressBar = (ProgressBar) findViewById(R.id.sisa_progressBar);
        mMensagemTextView = (TextView) findViewById(R.id.mensagem_textView);
    }
}
