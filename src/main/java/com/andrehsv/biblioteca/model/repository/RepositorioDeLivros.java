package com.andrehsv.biblioteca.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrehsv.biblioteca.model.entity.Livro;

public interface RepositorioDeLivros extends JpaRepository<Livro, Long>{
	void deleteById(long id);
}
