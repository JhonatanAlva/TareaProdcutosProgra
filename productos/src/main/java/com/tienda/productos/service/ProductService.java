package com.tienda.productos.service;

import com.tienda.productos.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> finAll();

    public Optional<Product> findById(Long id);

    public void createProduct(Product product);

    public void actualizarProduct(Long id, Product product);

    public void deleteProduct(Long id);

}
