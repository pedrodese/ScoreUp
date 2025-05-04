package io.github.pedrodese.customersmicroservices.application.representation;

import io.github.pedrodese.customersmicroservices.domain.Customer;
import lombok.Data;

@Data
public class CreateCustomerRequest {
    private String cpf;
    private String name;
    private Integer age;

    public Customer toEntity(){
        return new Customer(cpf, name, age);
    }
}
