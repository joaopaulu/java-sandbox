package com.produtos.springboot.service;

import java.util.List;

import com.produtos.springboot.models.Produto;
import com.produtos.springboot.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
	@Autowired
	ProdutoRepository produtoRepository;

	public List<Produto> todosProdutos() {
		return produtoRepository.findAll();
	}

	public Produto inserir(Produto produto) {
		return produtoRepository.save(produto);

	}

	public Produto editar(Produto produto) {
		return produtoRepository.save(produto);

	}
}
