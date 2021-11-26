package com.metahive.offical.server.service.impl;

import com.metahive.offical.server.entity.Product;
import com.metahive.offical.server.mapper.ProductMapper;
import com.metahive.offical.server.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author phx
 * @since 2021-11-26
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
