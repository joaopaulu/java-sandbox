package com.produtos.springboot.controllers;

import java.util.List;

import com.produtos.springboot.models.Produto;
import com.produtos.springboot.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;

	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}

	@GetMapping("/produto/{id}")
	public Produto listaProdutoUnico(@PathVariable(value="id") long id){
		return produtoRepository.findById(id);
	}

}
