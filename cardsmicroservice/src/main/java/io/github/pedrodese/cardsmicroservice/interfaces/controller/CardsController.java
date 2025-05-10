package io.github.pedrodese.cardsmicroservice.interfaces.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class CardsController {

    @GetMapping("/status")
    public ResponseEntity<String> applicationStatus(){
        
        return ResponseEntity.status(HttpStatus.OK).body("Cards Service Online!");
    }
    
}
