package com.example.application.db.livro;

import java.sql.Date;
import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Emprestimo extends AbstractBean{

    @OneToOne
    private Livro livro;

    @OneToOne
    private Aluno aluno;

    private Date dataDoEmprestimo;

    private Date dataDeDevolucao;

}
