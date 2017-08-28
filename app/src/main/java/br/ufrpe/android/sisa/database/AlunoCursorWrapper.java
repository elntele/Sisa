package br.ufrpe.android.sisa.database;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.renderscript.Type;

import com.google.gson.Gson;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.ufrpe.android.sisa.Aluno;
import br.ufrpe.android.sisa.Disciplina;

import static junit.runner.BaseTestRunner.getPreference;

/**
 * Created by jorge on 26/08/2017.
 */

public class AlunoCursorWrapper  extends CursorWrapper {
    /**
     * Creates a cursor wrapper.
     *
     * @param cursor The underlying cursor to wrap.
     */
    public AlunoCursorWrapper(Cursor cursor) {
        super(cursor);
    }


    public Aluno getAluno(){
        String idstring = getString(getColumnIndex(SisaDbSchema.AlunoTable.Cols.ID));
        String nomestring = getString(getColumnIndex(SisaDbSchema.AlunoTable.Cols.NOME));
        String emailstring = getString(getColumnIndex(SisaDbSchema.AlunoTable.Cols.EMAIL));
        String senhastring = getString(getColumnIndex(SisaDbSchema.AlunoTable.Cols.SENHA));
        String cpfstring = getString(getColumnIndex(SisaDbSchema.AlunoTable.Cols.CPF));
        String areastring = getString(getColumnIndex(SisaDbSchema.AlunoTable.Cols.AREA));
        String cursadasstring =  getString(getColumnIndex(SisaDbSchema.AlunoTable.Cols.CURSADAS));

        //adaptado, qq coisa voltar a pagina:
        //https://pt.stackoverflow.com/questions/33677/como-salvar-lista-de-objetos-em-android

        SharedPreferences  mPrefs = null; // esse null foi adaptado
        Gson gson = new Gson();
        String json = mPrefs.getString(cursadasstring, "");
        Type type = (Type) new TypeToken<ArrayList<Disciplina>>(){}.getType();
        ArrayList<Disciplina> listaCursadas = gson.fromJson(json, (java.lang.reflect.Type) type);

        String anodeingressostring = getString(getColumnIndex(SisaDbSchema.AlunoTable.Cols.ANODEINGRESSO));
        String periododeingressostring = getString(getColumnIndex(SisaDbSchema.AlunoTable.Cols.PERIODODEINGRESSO));
        String qtddeperiodostrancadosstring = getString(getColumnIndex(SisaDbSchema.AlunoTable.Cols.QTDDEPERIODOSTRANCADOS));
        Aluno aluno = new Aluno(UUID.fromString(idstring));
        aluno.setNome(nomestring);
        aluno.setEmail(emailstring);
        aluno.setSenha(senhastring);
        aluno.setCpf(Integer.parseInt(cpfstring));
        aluno.setCursadas(listaCursadas);
        aluno.setAndoDeIngresso(Integer.parseInt(anodeingressostring));
        aluno.setPeriodoDeIngresso(Integer.parseInt(periododeingressostring));
        aluno.setQtdDePeriodosTrancado(Integer.parseInt(qtddeperiodostrancadosstring));
        aluno.setArea(areastring);
        return aluno;
    }
}
