package com.rafaeldvl.springproject.model.repository;



import com.rafaeldvl.springproject.model.Produto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

    Iterable<Produto> findAll(Pageable page);
}
