package io.github.pedrodese.customersmicroservices.domain.exceptions;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(String cpf){
        super("customer not found for CPF: " + cpf);
    }
}
