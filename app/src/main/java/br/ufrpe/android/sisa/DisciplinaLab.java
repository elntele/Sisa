package br.ufrpe.android.sisa;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by jorge on 24/06/2017.
 * esta classe é um sigleton para mistra uma lista de disciplinas
 */

public class DisciplinaLab {

    private static DisciplinaLab sDisciplinaLab;
    private List<Disciplina> mDisciplinas;

    public static DisciplinaLab getInstance(Context context) {
        if (sDisciplinaLab == null) {
            sDisciplinaLab = new DisciplinaLab(context);
        }
        return sDisciplinaLab;
    }

    private DisciplinaLab(Context appContext) {

        mDisciplinas=new ArrayList<Disciplina>();

        Disciplina d1=new Disciplina();
        d1.setNome("Cálculo 1");
        d1.setCursada(false);
        d1.setCodigo("6446");
        d1.setPeriodo("1");
        d1.setSemestre("0");
        d1.setArea("FC");
        mDisciplinas.add(d1);

        Disciplina d2=new Disciplina();
        d2.setNome("Matemática Discreta 1");
        d2.setCursada(false);
        d2.setCodigo("14203");
        d2.setPeriodo("1");
        d2.setSemestre("0");
        d2.setArea("FC");
        mDisciplinas.add(d2);

        Disciplina d3=new Disciplina();
        d3.setNome("Programação 1");
        d3.setCursada(false);
        d3.setCodigo("14117");
        d3.setPeriodo("1");
        d3.setSemestre("0");
        d3.setArea("Ensiso");
        mDisciplinas.add(d3);

        Disciplina d4=new Disciplina();
        d4.setNome("Introdução à Ciência da Computaçâo");
        d4.setCursada(false);
        d4.setCodigo("14044");
        d4.setPeriodo("1");
        d4.setSemestre("0");
        d4.setArea("FC");
        mDisciplinas.add(d4);

        Disciplina d5=new Disciplina();
        d5.setNome("Álgebra Linear");
        d5.setCursada(false);
        d5.setCodigo("6418");
        d5.setPeriodo("1");
        d5.setSemestre("0");
        d5.setArea("FC");
        mDisciplinas.add(d5);

        Disciplina d6=new Disciplina();
        d6.setNome("Programação 2");
        d6.setCursada(false);
        d6.setCodigo("14118");
        d6.setPeriodo("2");
        d6.setSemestre("0");
        d6.setArea("Ensiso");
        mDisciplinas.add(d6);

        Disciplina d7=new Disciplina();
        d7.setNome("Matemática Discreta 2");
        d7.setCursada(false);
        d7.setCodigo("14204");
        d7.setPeriodo("2");
        d7.setSemestre("0");
        d7.setArea("FC");
        mDisciplinas.add(d7);

        Disciplina d8=new Disciplina();
        d8.setNome("Cáculo 2");
        d8.setCursada(false);
        d8.setCodigo("6445");
        d8.setPeriodo("2");
        d8.setSemestre("0");
        d8.setArea("FC");
        mDisciplinas.add(d8);

        Disciplina d9=new Disciplina();
        d9.setNome("Algoritmos Estruturados de Dados");
        d9.setCursada(false);
        d9.setCodigo("3212");
        d9.setPeriodo("2");
        d9.setSemestre("0");
        d9.setArea("FC");
        mDisciplinas.add(d9);

        Disciplina d10=new Disciplina();
        d10.setNome("Metodologia Cietífica Aplicada a Computação");
        d10.setCursada(false);
        d10.setCodigo("14112");
        d10.setPeriodo("2");
        d10.setSemestre("0");
        d10.setArea("FC");
        mDisciplinas.add(d10);

        Disciplina d11=new Disciplina();
        d11.setNome("Projeto e Análise de Algoritmos");
        d11.setCursada(false);
        d11.setCodigo("14087");
        d11.setPeriodo("3");
        d11.setSemestre("0");
        d11.setArea("FC");
        mDisciplinas.add(d11);

        Disciplina d12=new Disciplina();
        d12.setNome("Circuitos Digitais");
        d12.setCursada(false);
        d12.setCodigo("14087");
        d12.setPeriodo("3");
        d12.setSemestre("0");
        d12.setArea("ARQ");
        mDisciplinas.add(d12);

        Disciplina d13=new Disciplina();
        d13.setNome("Estatística Exploratoria");
        d13.setCursada(false);
        d13.setCodigo("3235");
        d13.setPeriodo("3");
        d13.setSemestre("0");
        d13.setArea("FC");
        mDisciplinas.add(d13);

        Disciplina d14=new Disciplina();
        d14.setNome("Teoria da Computação");
        d14.setCursada(false);
        d14.setCodigo("3219");
        d14.setPeriodo("3");
        d14.setSemestre("0");
        d14.setArea("FC");
        mDisciplinas.add(d14);

        Disciplina d15=new Disciplina();
        d15.setNome("Fisica Aplicada a Computação");
        d15.setCursada(false);
        d15.setCodigo("3285");
        d15.setPeriodo("3");
        d15.setSemestre("0");
        d15.setArea("FC");
        mDisciplinas.add(d15);

        Disciplina d16=new Disciplina();
        d16.setNome("Redes de Computadores ");
        d16.setCursada(false);
        d16.setCodigo("14058");
        d16.setPeriodo("4");
        d16.setSemestre("0");
        d16.setArea("ARQ");
        mDisciplinas.add(d16);

        Disciplina d17=new Disciplina();
        d17.setNome("Banco de Dados");
        d17.setCursada(false);
        d17.setCodigo("14088");
        d17.setPeriodo("4");
        d17.setSemestre("0");
        d17.setArea("Ensiso");
        mDisciplinas.add(d17);

        Disciplina d18=new Disciplina();
        d18.setNome("Arquitetura de Computadores");
        d18.setCursada(false);
        d18.setCodigo("14064");
        d18.setPeriodo("4");
        d18.setSemestre("0");
        d18.setArea("ARQ");
        mDisciplinas.add(d18);

        Disciplina d19=new Disciplina();
        d19.setNome("Engenharia de Software");
        d19.setCursada(false);
        d19.setCodigo("3222");
        d19.setPeriodo("4");
        d19.setSemestre("0");
        d19.setArea("Ensiso");
        mDisciplinas.add(d19);

        Disciplina d20=new Disciplina();
        d20.setNome("Paradigmas de Programação");
        d20.setCursada(false);
        d20.setCodigo("3242");
        d20.setPeriodo("4");
        d20.setSemestre("0");
        d20.setArea("Ensiso");
        mDisciplinas.add(d20);

        Disciplina d21=new Disciplina();
        d21.setNome("Compiladores");
        d21.setCursada(false);
        d21.setCodigo("14090");
        d21.setPeriodo("5");
        d21.setSemestre("0");
        d21.setArea("FC");
        mDisciplinas.add(d21);

        Disciplina d22=new Disciplina();
        d22.setNome("Inteligência Artificial");
        d22.setCursada(false);
        d22.setCodigo("14074");
        d22.setPeriodo("5");
        d22.setSemestre("0");
        d22.setArea("FC");
        mDisciplinas.add(d22);

        Disciplina d23=new Disciplina();
        d23.setNome("Projeto e Desenvolvimento de Software");
        d23.setCursada(false);
        d23.setCodigo("3241");
        d23.setPeriodo("5");
        d23.setSemestre("0");
        d23.setArea("Ensiso");
        mDisciplinas.add(d23);

        Disciplina d24=new Disciplina();
        d24.setNome("Sistemas Operacionais");
        d24.setCursada(false);
        d24.setCodigo("14065");
        d24.setPeriodo("5");
        d24.setSemestre("0");
        d24.setArea("ARQ");
        mDisciplinas.add(d24);

        Disciplina d25=new Disciplina();
        d25.setNome("Sistemas Distribuídos");
        d25.setCursada(false);
        d25.setCodigo("14059");
        d25.setPeriodo("5");
        d25.setSemestre("0");
        d25.setArea("ARQ");
        mDisciplinas.add(d25);

        Disciplina d26=new Disciplina();
        d26.setNome("Desenvolvimento de Aplicações para Web");
        d26.setCursada(false);
        d26.setCodigo("14125");
        d26.setPeriodo("0");
        d26.setSemestre("1");
        d26.setArea("Ensiso");
        mDisciplinas.add(d26);

        Disciplina d27=new Disciplina();
        d27.setNome("Jogos Digitais");
        d27.setCursada(false);
        d27.setCodigo("14042");
        d27.setPeriodo("0");
        d27.setSemestre("1");
        d27.setArea("Ensiso");
        mDisciplinas.add(d27);

        Disciplina d28=new Disciplina();
        d28.setNome("Teste de Software");
        d28.setCursada(false);
        d28.setCodigo("14321");
        d28.setPeriodo("0");
        d28.setSemestre("1");
        d28.setArea("Ensiso");
        mDisciplinas.add(d28);

        Disciplina d29 =new Disciplina();
        d29.setNome("Inovação em Projetos de Software");
        d29.setCursada(false);
        d29.setCodigo("14320");
        d29.setPeriodo("0");
        d29.setSemestre("1");
        d29.setArea("Ensiso");
        mDisciplinas.add(d29);

        Disciplina d30=new Disciplina();
        d30.setNome("Redes Neurais");
        d30.setCursada(false);
        d30.setCodigo("14020");
        d30.setPeriodo("0");
        d30.setSemestre("1");
        d30.setArea("FC");
        mDisciplinas.add(d30);

        Disciplina d31=new Disciplina();
        d31.setNome("Biologia Computacional");
        d31.setCursada(false);
        d31.setCodigo("14103");
        d31.setPeriodo("0");
        d31.setSemestre("1");
        d31.setArea("FC");
        mDisciplinas.add(d31);

        Disciplina d32=new Disciplina();
        d32.setNome("Visão Computacional");
        d32.setCursada(false);
        d32.setCodigo("14704");
        d32.setPeriodo("0");
        d32.setSemestre("1");
        d32.setArea("FC");
        mDisciplinas.add(d32);

        Disciplina d33=new Disciplina();
        d33.setNome("Computação Evolutiva");
        d33.setCursada(false);
        d33.setCodigo("6294");
        d33.setPeriodo("0");
        d33.setSemestre("1");
        d33.setArea("FC");
        mDisciplinas.add(d33);

        Disciplina d34=new Disciplina();
        d34.setNome("Algoritmos em Grafo");
        d34.setCursada(false);
        d34.setCodigo("14093");
        d34.setPeriodo("0");
        d34.setSemestre("1");
        d34.setArea("FC");
        mDisciplinas.add(d34);

    /*     for (int i=1;i<66;i++){
            Disciplina d=new Disciplina();
            d.setNome("disciplina nome"+i);
            d.setCursada(false);
            d.setCodigo(Integer.toString(i));
            mDisciplinas.add(d);
        }*/
    }

    public List<Disciplina> getDisciplinas(){
        return mDisciplinas;
    }

    public Disciplina getDisciplina(UUID id){
        for (Disciplina d: mDisciplinas){
            if (d.getId().equals(id)){
                return d;
            }
        }
        return null;
    }




}
