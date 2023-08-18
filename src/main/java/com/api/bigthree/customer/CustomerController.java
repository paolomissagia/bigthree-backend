package com.api.bigthree.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {
    private static final List<Customer> CUSTOMERS = List.of(
            new Customer(1L, "jaho", "doe", "Bon@red.com"),
            new Customer(2L, "kumara", "public", "hata@red.com"),
            new Customer(3L, "elon", "musk","elon@red.com"),
            new Customer(4L, "ruminem","duncan","marley@red.com")
    );
    @GetMapping
    public List<Customer> findAllCustomers() {
        return CUSTOMERS;
    }
}