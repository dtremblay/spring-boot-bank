package com.datsystems.mybank;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datsystems.mybank.model.Transaction;

@RestController
@RequestMapping(path = "/transactions", produces = MediaType.APPLICATION_JSON_VALUE)
public class TransactionController {

    private TransactionService service;
    
    public TransactionController(
            TransactionService service) {
        this.service = service;
    }
    
    @GetMapping(path = "{accountNumber}")
    public List<Transaction> findTransactionForAccountNumber(@PathVariable("accountNumber") String accountNumber) {
        //PageRequest page = PageRequest.of(0,12, Sort.by("createdAt").descending())
        return service.findAllByAccountNumber(accountNumber);
    }
}
