package com.example.application.services.livro;

import com.example.application.db.livro.Aluno;
import com.example.application.repository.livro.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public void saveAll(List<Aluno> alunoList){
        this.alunoRepository.saveAll(alunoList);
    }
}
