package com.example.experian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.experian.model.Cadastro;
import com.example.experian.repository.PessoaRepository;


@RestController
@RequestMapping("/pessoas")
public class PessoaController<Pessoa> {
	
	@Autowired
	private PessoaRepository cadastroRepository;

	
	@SuppressWarnings({ "hiding", "unchecked" })
	@GetMapping
	@ResponseStatus(HttpStatus.CREATED)
	public List<Pessoa> listar() {
		return (List<Pessoa>) cadastroRepository.findAll();
	}
	
	@PostMapping
	public Cadastro adicionar(@RequestBody Cadastro pessoas) {
		return cadastroRepository.save(pessoas);
	}
}
