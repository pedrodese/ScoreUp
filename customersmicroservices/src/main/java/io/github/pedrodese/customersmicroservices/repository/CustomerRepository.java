package io.github.pedrodese.customersmicroservices.repository;

import io.github.pedrodese.customersmicroservices.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByCpf(String cpf);
}
