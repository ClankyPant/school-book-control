package com.example.application.repository.livro;

import com.example.application.db.livro.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
