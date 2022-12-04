package com.rafaeldvl.springproject.controllers;

import com.rafaeldvl.springproject.model.Produto;
import com.rafaeldvl.springproject.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {


    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public Produto novoProduto(Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProduto(){
        return produtoRepository.findAll();
    }

    @GetMapping("/pagina/{numeroPage}")
    public Iterable<Produto> obterProdutosPagina(
            @PathVariable int numeroPage){
        Pageable page = PageRequest.of(numeroPage, 2);
        return produtoRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterProdutoId(@PathVariable int id){
        return produtoRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}
