package com.br.digitalhouse.ProdutoMesa.controller;

import com.br.digitalhouse.ProdutoMesa.Service.ProductService;

import com.br.digitalhouse.ProdutoMesa.domain.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product creatProduct(@RequestBody Product product){
    return productService.createProduct(product);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Product>> findByID(@PathVariable("id") Integer id){
        try {
            return ResponseEntity.ok(productService.findById(id));
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<Product> findByAll() {
        return productService.findByAll();
    }

    @PutMapping("{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product product) {
        product.setId(id);
        return productService.update(product);
    }

    @DeleteMapping("{id}")
    public void deleteById (@PathVariable Integer id) {
        productService.delete(id);
    }







}
