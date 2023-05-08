package com.tienda.productos.dao;

import com.tienda.productos.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {

}
