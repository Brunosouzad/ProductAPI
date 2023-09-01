package com.br.digitalhouse.ProdutoMesa.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;

@Entity
@Table(name = "products")
@Getter
@Setter
@Slf4j
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int amount;
    private String description;
    @Column(updatable = false)
    private Instant createAt;
    private Instant updateAt;


    @PrePersist
    public void create(){
        this.createAt = Instant.now();
        log.info("Running before creating record");
    }

    @PreUpdate
    public void update(){
        this.updateAt = Instant.now();
        log.info("Running before updating record");
    }
}
