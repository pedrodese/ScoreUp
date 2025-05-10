package io.github.pedrodese.customersmicroservices.interfaces.representation;

import io.github.pedrodese.customersmicroservices.domain.model.Customer;
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
