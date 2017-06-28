package br.ufrpe.android.sisa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GradeImagemActivity extends AppCompatActivity {
    private ImageView mIv;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_imagem);

        mIv = (ImageView) findViewById(R.id.imagem_grade_view);
        mButton = (Button) findViewById(R.id.button_grade_curso);
        mButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GradeImagemActivity.this, TelaInicialActivity.class);
                startActivity(intent);
            }
        });



    }
}
