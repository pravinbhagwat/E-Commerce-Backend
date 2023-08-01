package com.digitox.ecommercebackend.services;

import com.digitox.ecommercebackend.models.Product;
import com.digitox.ecommercebackend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Product not found with id: " + id));
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

   public Product updateProduct(Long id, Product updatedProduct) {
       Product existingProduct = productRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Product not found with id: " + id));
       existingProduct.setName(updatedProduct.getName());
       existingProduct.setPrice(updatedProduct.getPrice());
       existingProduct.setStockQuantity(updatedProduct.getStockQuantity());
       return productRepository.save(existingProduct);
   }

    public void deleteProduct(Long id) {
         productRepository.deleteById(id);
    }
}
