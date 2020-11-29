package com.example.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.ProdutoModel;
import com.example.springboot.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public ResponseEntity<List<ProdutoModel>> getAllProdutos() {
		List<ProdutoModel> produtosList = produtoService.todosProdutos();
		if (produtosList.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return new ResponseEntity<List<ProdutoModel>>(produtosList, HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<ProdutoModel> inserirProduto(@RequestBody ProdutoModel produto) {
		produtoService.inserir(produto);
		return ResponseEntity.status(HttpStatus.CREATED).body(produto);
	}

}
