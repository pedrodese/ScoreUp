package io.github.pedrodese.customersmicroservices.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.pedrodese.customersmicroservices.domain.model.Customer;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByCpf(String cpf);
}
