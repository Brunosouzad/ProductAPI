package com.br.digitalhouse.ProdutoMesa.Service;

import com.br.digitalhouse.ProdutoMesa.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct (Product product);
    Optional<Product> findById(Integer id);
    List<Product>findByAll();
    Product update(Product product);
    void delete(Integer id);


}
