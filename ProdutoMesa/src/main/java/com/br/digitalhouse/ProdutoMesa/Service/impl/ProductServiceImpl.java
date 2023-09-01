package com.br.digitalhouse.ProdutoMesa.Service.impl;

import com.br.digitalhouse.ProdutoMesa.Service.ProductService;
import com.br.digitalhouse.ProdutoMesa.domain.entity.Product;
import com.br.digitalhouse.ProdutoMesa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl( ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product createProduct(Product product) {
        Product productNew = productRepository.save(product);
        return productNew;
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findByAll() {
        Sort sort = Sort.by("name").ascending();
        return productRepository.findAll(sort);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }
}
