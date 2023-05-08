package com.tienda.productos.controller;

import com.tienda.productos.entity.Product;
import com.tienda.productos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("productos")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> listaProduct(){
        return productService.finAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Product> obtenerProductId(@RequestParam Long id){
        return productService.findById(id);
    }

    @PostMapping()
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    @PutMapping(value = "/{id}")
    public void actuProduct(@PathVariable Long id, @RequestBody Product product){
        productService.actualizarProduct(id, product);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
