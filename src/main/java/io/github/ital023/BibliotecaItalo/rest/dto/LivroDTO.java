package io.github.ital023.BibliotecaItalo.rest.dto;

import io.github.ital023.BibliotecaItalo.domain.entities.Autor;
import io.github.ital023.BibliotecaItalo.domain.entities.Editora;
import io.github.ital023.BibliotecaItalo.domain.entities.Genero;

public class LivroDTO {

    private String titulo;

    private String isbn;

    private Autor autor;

    private Editora editora;

    private Genero genero;

    private int AnoDePublicacao;


}
