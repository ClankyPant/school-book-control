package com.example.application.views.helloworld;

import com.example.application.db.livro.Aluno;
import com.example.application.services.livro.AlunoService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends HorizontalLayout {

    private TextField nome;

    private TextField turma;
    private Button sayHello;

    public HelloWorldView(@Autowired AlunoService alunoService) {
        nome = new TextField("Nome do Aluno:");
        turma = new TextField("Turma do Aluno:");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Aluno aluno = new Aluno(this.nome.getValue(), new ArrayList<>(), this.turma.getValue());
            alunoService.saveAll(Arrays.asList(aluno));
            Notification.show("Hello " + nome.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, nome, turma, sayHello);

        add(nome, turma, sayHello);
    }

}
