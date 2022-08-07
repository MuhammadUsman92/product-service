package com.muhammadusman92.productservice.repo;

import com.muhammadusman92.productservice.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,String> {
}
