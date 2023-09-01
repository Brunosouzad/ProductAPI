package com.br.digitalhouse.ProdutoMesa.repository;

import com.br.digitalhouse.ProdutoMesa.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
