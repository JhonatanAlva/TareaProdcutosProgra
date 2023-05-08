package com.tienda.productos.service;

import com.tienda.productos.dao.ProductDao;
import com.tienda.productos.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> finAll() {
        return (List<Product>)productDao.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public void createProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public void actualizarProduct(Long id, Product product) {
        if(productDao.existsById(id)){
            product.setId(id);
            productDao.save(product);
        }
    }

    @Override
    public void deleteProduct(Long id) {
        if(productDao.existsById(id)){
            productDao.deleteById(id);
        }
    }
}
