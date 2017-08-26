package br.ufrpe.android.sisa.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.ufrpe.android.sisa.Disciplina;
import br.ufrpe.android.sisa.database.SisaDbSchema.DisciplinaTable;

/**
 * Created by jorge on 20/08/2017.
 */

public class DisciplinaBaseHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "disciplinaBase.db";

    public DisciplinaBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ DisciplinaTable.NAME + "(" +
                "_id integer primary key autoincrement, " +
                DisciplinaTable.Cols.ID + ", " +
                DisciplinaTable.Cols.AREA + ", " +
                DisciplinaTable.Cols.CODIGO + ", " +
                DisciplinaTable.Cols.PERIODO + ", " +
                DisciplinaTable.Cols.SEMESTRE + ", " +
                DisciplinaTable.Cols.CURSADA +", " +
                DisciplinaTable.Cols.NOME+
                ")"

        );




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
