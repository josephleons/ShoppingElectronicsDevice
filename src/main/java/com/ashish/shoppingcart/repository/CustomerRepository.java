package com.ashish.shoppingcart.repository;
import com.ashish.shoppingcart.entity.Customer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
 @Configuration
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {


    public Customer getCustomerByEmailAndName(String email,String name);

    Customer save(Customer customer);
}
