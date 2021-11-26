package com.metahive.offical.server.controller;


import com.metahive.offical.server.entity.Product;
import com.metahive.offical.server.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author phx
 * @since 2021-11-26
 */
@RestController
@RequestMapping("/server/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> selectProduct() {
        return productService.list();
    }

    @GetMapping("/{productId}")
    public Product selectProductById(@PathVariable String productId) {
        return productService.getById(productId);
    }
}

