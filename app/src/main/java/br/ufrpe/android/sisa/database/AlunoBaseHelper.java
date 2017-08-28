package br.ufrpe.android.sisa.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jorge on 26/08/2017.
 */

public class AlunoBaseHelper extends SQLiteOpenHelper {


    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "alunoBase.db";
    public AlunoBaseHelper(Context context) {
        super(context, DATABASE_NAME, null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        db.execSQL("create table "+ SisaDbSchema.AlunoTable.NAME + "(" +
                "_id integer primary key autoincrement, " +
                SisaDbSchema.AlunoTable.Cols.ID + ", " +
                SisaDbSchema.AlunoTable.Cols.NOME + ", " +
                SisaDbSchema.AlunoTable.Cols.CPF + ", " +
                SisaDbSchema.AlunoTable.Cols.EMAIL + ", " +
                SisaDbSchema.AlunoTable.Cols.SENHA + ", " +
                SisaDbSchema.AlunoTable.Cols.AREA +", " +
                SisaDbSchema.AlunoTable.Cols.CURSADAS +"," +
                SisaDbSchema.AlunoTable.Cols.ANODEINGRESSO + ", " +
                SisaDbSchema.AlunoTable.Cols.PERIODODEINGRESSO +"," +
                SisaDbSchema.AlunoTable.Cols.QTDDEPERIODOSTRANCADOS +

                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
