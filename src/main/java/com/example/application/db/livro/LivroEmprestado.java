package com.example.application.db.livro;

import java.util.Calendar;

public class LivroEmprestado {

    private Livro livroComAluno;
    private Aluno alunoComLivro;
    private Calendar dataDoEmprestimo;
    private Calendar dataDeDevolucao;

    public Aluno getAlunoComLivro() {
        return alunoComLivro;
    }

    public Calendar getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public Calendar getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public Livro getLivroComAluno() {
        return livroComAluno;
    }

    public void setAlunoComLivro(Aluno alunoComLivro) {
        this.alunoComLivro = alunoComLivro;
    }

    public void setDataDeDevolucao(Calendar dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public void setDataDoEmprestimo(Calendar dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public void setLivroComAluno(Livro livroComAluno) {
        this.livroComAluno = livroComAluno;
    }
}
