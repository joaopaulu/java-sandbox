package com.produtos.springboot.controllers;

import java.util.List;

import com.produtos.springboot.models.Produto;
import com.produtos.springboot.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;

	@GetMapping("/produto")
	@ApiOperation(value = "Retorna uma lista de produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}

	@GetMapping("/produto/{id}")
	@ApiOperation(value = "Retorna um produto")
	public Produto listaProdutoUnico(@PathVariable(value="id") long id){
		return produtoRepository.findById(id);
	}

	@PostMapping("/produto")
	@ApiOperation(value = "Insere um produto")
	public  Produto salvarProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}

	@DeleteMapping("/produto/{id}")
	@ApiOperation(value = "Deleta um produto")
	public void deleteProduto(@PathVariable(value="id") Long id){
		produtoRepository.deleteById(id);
	}

	@PutMapping("/produto/{id}")
	@ApiOperation(value = "Atualiza um produto")
	public Produto atualizaProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}



}
