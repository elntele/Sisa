package br.ufrpe.android.sisa;

import java.util.UUID;

/**
 * Created by jorge on 24/06/2017.
 */

public class Disciplina {
    private UUID mId;
    private String mNome;
    private int mCodigo;
    private String mPeriodo;
    private int mSemestre;
    private String mArea;
    private String mSegunda;
    private String mTerca;
    private String mQuarta;
    private String mQuinta;
    private String mSexta;
    private String[] mDiaHora= new String[5];


    public Disciplina(UUID id, String nome, int codigo, String periodo, int semestre, String area,
                      String segunda,String terca, String quarta, String quinta, String sexta) {
        mId = id;
        mNome = nome;
        mCodigo = codigo;
        mPeriodo = periodo;
        mSemestre = semestre;
        mArea = area;
        mSegunda = segunda;
        mTerca = terca;
        mQuarta = quarta;
        mQuinta = quinta;
        mSexta = sexta;
    }
    @Override
    public String toString() {
        return mNome;
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

    public int getCodigo() {
        return mCodigo;
    }

    public void setCodigo(int codigo) {
        mCodigo = codigo;
    }

    public String getPeriodo() {
        return mPeriodo;
    }

    public void setPeriodo(String periodo) {
        mPeriodo = periodo;
    }

    public int getSemestre() {
        return mSemestre;
    }

    public void setSemestre(int semestre) {
        mSemestre = semestre;
    }

    public String getArea() {
        return mArea;
    }

    public void setArea(String area) {
        mArea = area;
    }

    public String getSegunda() {
        return mSegunda;
    }

    public void setSegunda(String segunda) {
        mSegunda = segunda;
    }

    public String getTerca() {
        return mTerca;
    }

    public void setTerca(String terca) {
        mTerca = terca;
    }

    public String getQuarta() {
        return mQuarta;
    }

    public void setQuarta(String quarta) {
        mQuarta = quarta;
    }

    public String getQuinta() {
        return mQuinta;
    }

    public void setQuinta(String quinta) {
        mQuinta = quinta;
    }

    public String getSexta() {
        return mSexta;
    }

    public void setSexta(String sexta) {
        mSexta = sexta;
    }

    public void setDiaHora(){
        this.mDiaHora[0]=this.mSegunda;
        this.mDiaHora[1]=this.mTerca;
        this.mDiaHora[2]=this.mQuarta;
        this.mDiaHora[3]=this.mQuinta;
        this.mDiaHora[4]=this.mSexta;
    }

    public Disciplina() {

    }
}
