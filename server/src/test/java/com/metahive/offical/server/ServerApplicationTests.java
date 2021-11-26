package com.metahive.offical.server;

import com.metahive.offical.server.entity.Product;
import com.metahive.offical.server.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ServerApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    // 全查询
    @Test
    void searchTest() {
        List<Product> products = productMapper.selectList(null);
        products.forEach(System.out::println);
    }

}
