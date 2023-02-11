package com.ashish.shoppingcart;
import com.ashish.shoppingcart.entity.Customer;
import com.ashish.shoppingcart.entity.Order;
import com.ashish.shoppingcart.entity.Product;
import com.ashish.shoppingcart.repository.CustomerRepository;
import com.ashish.shoppingcart.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashish.shoppingcart.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Configuration
public class ShoppingCartConfig {

    @Bean
    public OrderRepository orderRepository() {
        return new OrderRepository() {
            @Override
            public Optional<Order> findById(int orderId) {
                return Optional.empty();
            }

            @Override
            public Order save(Order order) {
                return null;
            }
        };
    }
    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository() {
            @Override
            public Optional<Product> findById(int productId) {
                return Optional.empty();
            }

            @Override
            public Product save(Product product1) {
                return null;
            }

            @Override
            public List<Product> findAll() {
                return null;
            }
        };
    }
    @Bean
    public CustomerRepository customerRepository() {
        return new CustomerRepository() {

            @Override
            public Customer getCustomerByEmailAndName(String email, String name) {
                return null;
            }

            @Override
            public Customer save(Customer customer) {
                return null;
            }
        };
    }
}
