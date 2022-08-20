package com.example.application.db.livro;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Livro extends AbstractBean {

    @OneToOne
    private Titulo titulo;

    private Integer sequencia;


}
