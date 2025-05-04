package io.github.pedrodese.customersmicroservices.application.service;

import io.github.pedrodese.customersmicroservices.application.exceptions.CustomerNotFoundException;
import io.github.pedrodese.customersmicroservices.domain.Customer;
import io.github.pedrodese.customersmicroservices.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Transactional
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getCustomerByCpf(String cpf){
        return customerRepository.findByCpf(cpf)
                .orElseThrow(() -> new CustomerNotFoundException(cpf));
    }


}
