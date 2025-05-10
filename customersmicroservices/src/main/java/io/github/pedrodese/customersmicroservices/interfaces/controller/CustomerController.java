package io.github.pedrodese.customersmicroservices.interfaces.controller;

import io.github.pedrodese.customersmicroservices.application.service.CustomerService;
import io.github.pedrodese.customersmicroservices.interfaces.representation.CreateCustomerRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/status")
    public ResponseEntity<String> applicationStatus(){
        log.info("getting micro service status from clients");
        return ResponseEntity.status(HttpStatus.OK).body("Customers Service Online!");
    }

    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody CreateCustomerRequest request){
        var customer = request.toEntity();
        customerService.save(customer);
        URI headerLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("cpf={cpf}")
                .buildAndExpand(customer.getCpf())
                .toUri();
        return ResponseEntity.created(headerLocation).build();
    }

    @GetMapping
    public ResponseEntity<?> getCustomerByCpf(@RequestParam("cpf") String cpf){
        return ResponseEntity.ok(customerService.getCustomerByCpf(cpf));
    }

}
