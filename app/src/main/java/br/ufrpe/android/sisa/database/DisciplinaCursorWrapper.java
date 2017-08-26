package br.ufrpe.android.sisa.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import java.util.UUID;

import br.ufrpe.android.sisa.Disciplina;

/**
 * Created by jorge on 22/08/2017.
 */

public class DisciplinaCursorWrapper extends CursorWrapper {
    /**
     * Creates a cursor wrapper.
     *
     * @param cursor The underlying cursor to wrap.
     */
    public DisciplinaCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Disciplina getDisciplina() {

        String nomestring = getString(getColumnIndex(SisaDbSchema.DisciplinaTable.Cols.NOME));
        String idstring = getString(getColumnIndex(SisaDbSchema.DisciplinaTable.Cols.ID));
        String areastring = getString(getColumnIndex(SisaDbSchema.DisciplinaTable.Cols.AREA));
        String periodostring = getString(getColumnIndex(SisaDbSchema.DisciplinaTable.Cols.PERIODO));
        String codigostring = getString(getColumnIndex(SisaDbSchema.DisciplinaTable.Cols.CODIGO));
        String semestrestring = getString(getColumnIndex(SisaDbSchema.DisciplinaTable.Cols.SEMESTRE));
        int iscursada = getInt(getColumnIndex(SisaDbSchema.DisciplinaTable.Cols.CURSADA));
        Disciplina disciplina = new Disciplina(UUID.fromString(idstring));
        disciplina.setNome(nomestring);
        disciplina.setArea(areastring);
        disciplina.setPeriodo(periodostring);
        disciplina.setCodigo(codigostring);
        disciplina.setSemestre(semestrestring);
        disciplina.setCursada(iscursada!=0);
        return disciplina;




    }



}
