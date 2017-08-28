package br.ufrpe.android.sisa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by jorge on 26/08/2017.
 */

public class Aluno implements Serializable {
    private UUID mId;
    private String mNome;
    private String Email;
    private String mSenha;
    private int mCpf;
    private ArrayList <Disciplina> mCursadas = new ArrayList<>();
    private int qtdDePeriodosTrancado;
    private int mAndoDeIngresso;
    private int mPeriodoDeIngresso;
    private int mHorasDeEstudoExtraClasse;
    private String mArea;

    public Aluno() {
        this(UUID.randomUUID());
    }

    public Aluno(UUID id) {
        mId = id;

    }


    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getNome() {
        return mNome;
    }

    public void setNome(String nome) {
        mNome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return mSenha;
    }

    public void setSenha(String senha) {
        mSenha = senha;
    }

    public int getCpf() {
        return mCpf;
    }

    public void setCpf(int cpf) {
        mCpf = cpf;
    }

    public ArrayList<Disciplina> getCursadas() {
        return mCursadas;
    }

    public void setCursadas(ArrayList<Disciplina> cursadas) {
        mCursadas = cursadas;
    }

    public int getQtdDePeriodosTrancado() {
        return qtdDePeriodosTrancado;
    }

    public void setQtdDePeriodosTrancado(int qtdDePeriodosTrancado) {
        this.qtdDePeriodosTrancado = qtdDePeriodosTrancado;
    }

    public int getAndoDeIngresso() {
        return mAndoDeIngresso;
    }

    public void setAndoDeIngresso(int andoDeIngresso) {
        mAndoDeIngresso = andoDeIngresso;
    }

    public int getPeriodoDeIngresso() {
        return mPeriodoDeIngresso;
    }

    public void setPeriodoDeIngresso(int periodoDeIngresso) {
        mPeriodoDeIngresso = periodoDeIngresso;
    }

    public String getArea() {
        return mArea;
    }

    public void setArea(String area) {
        mArea = area;
    }
}
