package com.ms.product.service.controller;

import com.ms.product.service.model.Product;
import com.ms.product.service.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @GetMapping("/by-product-id/{productId}")
    public Product getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }

    @GetMapping("/by-user-id/{userId}")
    public List<Product> getProductByUserId(@PathVariable Long userId) {
        return productService.getProductByUserId(userId);
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping("/edit/{productId}")
    public void editProduct(@PathVariable Long productId, @RequestBody Product product) {
        Product productToUpdate = productService.getProductById(productId);

        productToUpdate.setProductId(product.getProductId());

        productService.addProduct(productToUpdate);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
    }
}

