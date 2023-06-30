package com.andrehsv.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrehsv.biblioteca.model.entity.Livro;
import com.andrehsv.biblioteca.service.ServicoDeLivros;

@RequestMapping("/biblioteca")
@RestController
public class BibliotecaController {
	
	@Autowired
	private ServicoDeLivros servicoDeLivros;
	
	@PostMapping("/adicionar-livro")
	public Livro adicionarLivro(@RequestBody Livro livro) {
		return servicoDeLivros.addLivro(livro);
	}
	
	@GetMapping
	public List<Livro> mostrarLivros() {
		return servicoDeLivros.getLivros();
	}
	
	@DeleteMapping("/remover-livro/{id}")
	public void removerLivro(@PathVariable String id) {
		servicoDeLivros.deleteLivroById(Long.parseLong(id));
	}
}
