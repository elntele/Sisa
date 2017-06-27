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
    private Context mAppContext;
    private ArrayList<Disciplina> mDisciplinas;

    private DisciplinaLab(Context appContext) {
        mAppContext = appContext;
        mDisciplinas=new ArrayList<Disciplina>();
        Disciplina D=new Disciplina();
        D.setNome("Cálculo 1");
        D.setSolved(false);
        D.setCodigo("1");
        mDisciplinas.add(D);
        Disciplina Di=new Disciplina();
        Di.setNome("matemática Discreta 1");
        Di.setSolved(false);
        Di.setCodigo("2");
        mDisciplinas.add(Di);
        Disciplina De=new Disciplina();
        De.setNome("Programação 1");
        De.setSolved(false);
        De.setCodigo("3");
        mDisciplinas.add(De);
        Disciplina Da=new Disciplina();
        Da.setNome("Iniciação a computaçao");
        Da.setSolved(false);
        Da.setCodigo("4");
        mDisciplinas.add(Da);
        Disciplina Do=new Disciplina();
        Do.setNome("Algebra");
        Da.setSolved(false);
        Do.setCodigo("5");
        mDisciplinas.add(Do);
        Disciplina Du=new Disciplina();
        Du.setNome("Programação 2");
        Du.setSolved(false);
        Du.setCodigo("6");
        mDisciplinas.add(Du);
        Disciplina Ad=new Disciplina();
        Ad.setNome("Matemática Discreta 2");
        Ad.setSolved(false);
        Ad.setCodigo("7");
        mDisciplinas.add(Ad);
        Disciplina ed=new Disciplina();
        ed.setNome("Cáculo 2");
        ed.setSolved(false);
        ed.setCodigo("8");
        mDisciplinas.add(ed);
        Disciplina id=new Disciplina();
        id.setNome("Algoritmos Estruturados de Dados");
        id.setSolved(false);
        id.setCodigo("9");
        mDisciplinas.add(id);
        Disciplina od=new Disciplina();
        od.setNome("Metodologia Cietífica Aplicada a Computação");
        od.setSolved(false);
        od.setCodigo("10");
        mDisciplinas.add(od);

        Disciplina ud=new Disciplina();
        ud.setNome("Projeto e Analise de Algoritmos");
        ud.setSolved(false);
        ud.setCodigo("11");
        mDisciplinas.add(ud);

        Disciplina c=new Disciplina();
        c.setNome("Circuitos Digitais");
        c.setSolved(false);
        c.setCodigo("12");
        mDisciplinas.add(c);

        Disciplina a=new Disciplina();
        a.setNome("Estatística Exploratoria");
        a.setSolved(false);
        a.setCodigo("13");
        mDisciplinas.add(a);

        Disciplina i=new Disciplina();
        i.setNome("Teoria da Computação");
        i.setSolved(false);
        i.setCodigo("14");
        mDisciplinas.add(i);

        Disciplina s=new Disciplina();
        s.setNome("Fisica Aplicada a Computação");
        s.setSolved(false);
        s.setCodigo("15");
        mDisciplinas.add(s);

        Disciplina p=new Disciplina();
        p.setNome("Redes de Computadores ");
        p.setSolved(false);
        p.setCodigo("16");
        mDisciplinas.add(p);

        Disciplina l=new Disciplina();
        l.setNome("Banco de Dados");
        l.setSolved(false);
        l.setCodigo("17");
        mDisciplinas.add(l);

        Disciplina n=new Disciplina();
        n.setNome("Arquitetura de Computadores");
        n.setSolved(false);
        c.setCodigo("18");
        mDisciplinas.add(n);

        Disciplina ca=new Disciplina();
        ca.setNome("Engenharia de Software");
        ca.setSolved(false);
        ca.setCodigo("19");
        mDisciplinas.add(ca);

        Disciplina ce=new Disciplina();
        ce.setNome("Paradigmas de Programação");
        ce.setSolved(false);
        ce.setCodigo("20");
        mDisciplinas.add(ce);

        Disciplina ci=new Disciplina();
        ci.setNome("Compiladores");
        ci.setSolved(false);
        ci.setCodigo("21");
        mDisciplinas.add(ci);

        Disciplina co=new Disciplina();
        co.setNome("Inteligência Artificial");
        co.setSolved(false);
        co.setCodigo("22");
        mDisciplinas.add(co);

        Disciplina cu=new Disciplina();
        cu.setNome("Projeto e Desenvolvimento de Software");
        cu.setSolved(false);
        cu.setCodigo("23");
        mDisciplinas.add(cu);

        Disciplina sa=new Disciplina();
        sa.setNome("Sistemas Operacionais");
        sa.setSolved(false);
        sa.setCodigo("24");
        mDisciplinas.add(sa);

        Disciplina se=new Disciplina();
        se.setNome("sistemas Distribuídos");
        se.setSolved(false);
        se.setCodigo("25");
        mDisciplinas.add(se);

        Disciplina si=new Disciplina();
        si.setNome("Desenvolvimento de Aplicações para Web");
        si.setSolved(false);
        si.setCodigo("26");
        mDisciplinas.add(si);

        Disciplina so=new Disciplina();
        so.setNome("Jogos Digitais");
        so.setSolved(false);
        so.setCodigo("27");
        mDisciplinas.add(so);

        Disciplina su=new Disciplina();
        su.setNome("Teste de Software");
        su.setSolved(false);
        su.setCodigo("28");
        mDisciplinas.add(su);

        Disciplina pa =new Disciplina();
        pa.setNome("Inovação em Projetos de Software");
        pa.setSolved(false);
        pa.setCodigo("29");
        mDisciplinas.add(pa);

        Disciplina pe=new Disciplina();
        pe.setNome("Sistemas Distribuídos");
        pe.setSolved(false);
        pe.setCodigo("30");
        mDisciplinas.add(pe);

        Disciplina pi=new Disciplina();
        pi.setNome("Redes Neurais");
        pi.setSolved(false);
        pi.setCodigo("31");
        mDisciplinas.add(pi);

        Disciplina po=new Disciplina();
        po.setNome("Biologia Computacional");
        po.setSolved(false);
        po.setCodigo("32");
        mDisciplinas.add(po);

        Disciplina pu=new Disciplina();
        pu.setNome("Visão Computacional");
        pu.setSolved(false);
        pu.setCodigo("33");
        mDisciplinas.add(pu);

        Disciplina la=new Disciplina();
        la.setNome("Computação Evolutiva");
        la.setSolved(false);
        la.setCodigo("34");
        mDisciplinas.add(la);

        Disciplina le=new Disciplina();
        le.setNome("Algoritmos em Grafo");
        le.setSolved(false);
        le.setCodigo("35");
        mDisciplinas.add(le);

        // for (int i=1;i<66;i++){
        //    Disciplina d=new Disciplina();
         //   d.setNome("disciplina numero "+i);
         //   d.setSolved(false);
         //   d.setCodigo(Integer.toString(i));
         //   mDisciplinas.add(d);
       // }
    }

    public ArrayList<Disciplina> getDisciplinas(){
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




    static DisciplinaLab getInstance(Context c) {
        if (sDisciplinaLab == null) {
            sDisciplinaLab = new DisciplinaLab(c.getApplicationContext());
        }
        return sDisciplinaLab;
    }
}
