package br.ufrpe.android.sisa.database;

/**
 * Created by jorge on 20/08/2017.
 */

public class SisaDbSchema {

    public static final class DisciplinaTable {
        public static final String NAME = "disciplina";
        public static final class Cols {
            public static final String NOME ="nome";
            public static final String ID ="id";
            public static final String CODIGO="codigo";
            public static final String PERIODO ="periodo";
            public static final String SEMESTRE = "qtd";
            public static final String CURSADA="cursada";
            public static final String AREA = "area";

        }
    }

    public static final class AlunoTable {
        public static final String NAME = "aluno";
        public static final class Cols {
            public static final String ID ="id";
            public static final String NOME ="nome";
            public static final String EMAIL="email";
            public static final String SENHA ="senha";
            public static final String CPF ="cpf";
            public static final String CURSADAS= "cursadas";
            public static final String QTDDEPERIODOSTRANCADOS = "qtddeperiodostrancados";
            public static final String ANODEINGRESSO = "anodeingresso";
            public static final String PERIODODEINGRESSO="periododeingresso";
            public static final String AREA = "area";

        }
    }
}
