package com.mojdigital.backend.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CustomerService {

    CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public ApplyResponse apply(ApplyRequest applyRequest) {
        var customer = new Customer();
        customer.setName(applyRequest.getName());
        customer.setAge(applyRequest.getAge());
        customer.setSex(applyRequest.getSex());
        customer.setCountry(applyRequest.getCountry());
        customer.setDateCreated(LocalDateTime.now());

        var newCustomer = customerRepository.saveAndFlush(customer);
        return new ApplyResponse(newCustomer.getId());
    }
}
