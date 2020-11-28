package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.models.ProdutoModel;
import com.example.springboot.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	 @Autowired
	 ProdutoRepository produtoRepository;
	 
	 public List<ProdutoModel> todosProdutos(){
		 return produtoRepository.findAll();
	 }
	 
	 public ProdutoModel inserir(ProdutoModel produto) {
		 return produtoRepository.save(produto);
		 
	 }
}
