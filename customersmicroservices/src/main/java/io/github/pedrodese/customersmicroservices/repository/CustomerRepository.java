package io.github.pedrodese.customersmicroservices.repository;

import io.github.pedrodese.customersmicroservices.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    Optional<Customer> findByCpf(String cpf);
}
