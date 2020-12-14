package com.datsystems.mybank;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.datsystems.mybank.model.Transaction;

public class TransactionServiceTest {
    private static TransactionService service;
    
    @BeforeAll
    public static void setup() {
        service = new TransactionService();
    }
    
    @Test
    public void testFindAllByAccountNumber() {
        String accountNumber = "1234";
        List<Transaction> transactions = service.findAllByAccountNumber(accountNumber);
        assertTrue(transactions.size() > 0 );
    }
}
