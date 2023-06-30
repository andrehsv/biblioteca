package com.andrehsv.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrehsv.biblioteca.model.entity.Livro;
import com.andrehsv.biblioteca.model.repository.RepositorioDeLivros;

@Service
public class ServicoDeLivros {
	
	@Autowired
	private RepositorioDeLivros repositorioDeLivros;
	
	public Livro addLivro(Livro livro) {
		return repositorioDeLivros.save(livro);
	}
	
	public List<Livro> getLivros() {
		return repositorioDeLivros.findAll();
	}
	
	public void deleteLivroById(long id) {
		repositorioDeLivros.deleteById(id);
	}
}
