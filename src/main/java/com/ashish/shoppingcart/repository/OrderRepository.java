package com.ashish.shoppingcart.repository;
import com.ashish.shoppingcart.entity.Order;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Configuration
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    Optional<Order> findById(int orderId);


    Order save(Order order);
}
