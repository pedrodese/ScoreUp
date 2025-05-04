package io.github.pedrodese.customersmicroservices.application.exceptions;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(String cpf){
        super("customer not found for CPF: " + cpf);
    }
}
