package io.github.ital023.BibliotecaItalo.rest.controller;

import io.github.ital023.BibliotecaItalo.domain.entities.Livro;
import io.github.ital023.BibliotecaItalo.rest.dto.LivroDTO;
import io.github.ital023.BibliotecaItalo.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/livro")
public class LivroController {

    @Autowired
    LivroService livroService;

    /*@PostMapping
    private Livro salvar(LivroDTO livroDTO){

    }*/


}