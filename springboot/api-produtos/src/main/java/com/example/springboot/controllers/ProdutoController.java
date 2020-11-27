package com.example.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.ProdutoModel;
import com.example.springboot.repositories.ProdutoRepository;

@RestController
public class ProdutoController {

  @Autowired
  ProdutoRepository produtoRepository;

  @GetMapping("/produtos")
  public ResponseEntity<List<ProdutoModel>> getAllProdutos() {
    List<ProdutoModel> produtosList = produtoRepository.findAll();
    if (produtosList.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } else {
      return new ResponseEntity<List<ProdutoModel>>(produtosList, HttpStatus.OK);
    }

  }

}
