package com.example.application.db.livro;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Titulo extends AbstractBean{

    private String titulo;


}
