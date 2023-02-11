package com.ashish.shoppingcart.repository;

import com.ashish.shoppingcart.entity.Order;
import com.ashish.shoppingcart.entity.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

//import java.util.List;
import java.util.List;
import java.util.Optional;

@Configuration
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Optional<Product> findById(int productId);

    Product save(Product product1);

    List<Product> findAll();
//    List<Product> findAll();
}