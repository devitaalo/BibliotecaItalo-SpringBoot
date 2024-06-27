package io.github.ital023.BibliotecaItalo.domain.repositories;

import io.github.ital023.BibliotecaItalo.domain.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Integer, Livro> {



}
