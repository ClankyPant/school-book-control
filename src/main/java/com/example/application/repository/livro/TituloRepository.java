package com.example.application.repository.livro;

import com.example.application.db.livro.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

}
