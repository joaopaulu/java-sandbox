package com.produtos.springboot.controllers;

import java.util.List;

import com.produtos.springboot.models.Produto;
import com.produtos.springboot.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public ResponseEntity<List<Produto>> getAllProdutos() {
		List<Produto> produtosList = produtoService.todosProdutos();
		if (produtosList.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return new ResponseEntity<List<Produto>>(produtosList, HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<Produto> inserirProduto(@RequestBody Produto produto) {
		produtoService.inserir(produto);
		return ResponseEntity.status(HttpStatus.CREATED).body(produto);
	}

}
