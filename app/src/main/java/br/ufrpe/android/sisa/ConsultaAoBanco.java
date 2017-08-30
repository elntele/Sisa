package br.ufrpe.android.sisa;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.ufrpe.android.sisa.database.AlunoBaseHelper;
import br.ufrpe.android.sisa.database.AlunoCursorWrapper;
import br.ufrpe.android.sisa.database.SisaDbSchema;

/**
 * Created by jorge on 29/08/2017.
 */

public class ConsultaAoBanco {
    private Context mContext;// add para o banco
    private SQLiteDatabase mDatabase; // add para o banco
    private static ConsultaAoBanco sConsultaAoBanco;



    public ConsultaAoBanco(Context appContext) {
        mContext = appContext.getApplicationContext(); // add para o banco
        mDatabase = new AlunoBaseHelper(mContext)// add para o banco
                .getWritableDatabase();
    }


    public static ConsultaAoBanco getInstance(Context context) {
        if (sConsultaAoBanco == null) {
            sConsultaAoBanco = new ConsultaAoBanco(context);
        }
        return sConsultaAoBanco;
    }


    public Aluno getAluno(UUID id){
        AlunoCursorWrapper cursor = queryAluno(
                SisaDbSchema.AlunoTable.Cols.ID + " = ?",
                new String[] { id.toString() }
        );
        try {
            if (cursor.getCount() == 0) {
                return null;
            }
            cursor.moveToFirst();
            return cursor.getAluno();
        } finally {
            cursor.close();
        }
    }


    public List<Aluno> getAlunos(){
        List<Aluno> alunos = new ArrayList<>();
        AlunoCursorWrapper cursor = queryAluno(null, null);
        try {
            cursor.moveToFirst();

            while (!cursor.isAfterLast()) {
                alunos.add(cursor.getAluno());
                cursor.moveToNext();
            }
        } finally {
            cursor.close();
        }
        return alunos;
    }


    private AlunoCursorWrapper queryAluno(String whereClause, String[] whereArgs) {
        Cursor cursor = mDatabase.query(
                SisaDbSchema.AlunoTable.NAME,
                null, // columns - null selects all columns
                whereClause,
                whereArgs,
                null, // groupBy
                null, // having
                null // orderBy
        );
        return new AlunoCursorWrapper(cursor);
    }
}
