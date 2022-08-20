package com.example.application.db.livro;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Emprestimo {

    private Livro livro;
    private Aluno aluno;
    private Calendar dataDoEmprestimo;
    private Calendar dataDeDevolucao;

}
