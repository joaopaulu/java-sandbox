package com.produtos.springboot.controllers;

import java.util.List;

import com.produtos.springboot.models.Produto;
import com.produtos.springboot.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;

	@GetMapping("/produtos")
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

	@DeleteMapping("/produto")
	@ApiOperation(value = "Deleta um produto")
	public void deleteProduto(@RequestBody Produto produto){
		produtoRepository.delete(produto);
	}

	@PutMapping("/produto")
	@ApiOperation(value = "Atualiza um produto")
	public Produto atualizaProduto(@RequestBody Produto produto){
		return produtoRepository.save(produto);
	}



}
