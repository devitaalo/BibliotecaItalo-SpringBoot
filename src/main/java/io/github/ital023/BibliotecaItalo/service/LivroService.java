package io.github.ital023.BibliotecaItalo.service;

import io.github.ital023.BibliotecaItalo.domain.entities.Livro;
import io.github.ital023.BibliotecaItalo.rest.dto.LivroDTO;

public interface LivroService {

    Livro salvar(LivroDTO livroDTO);

}
