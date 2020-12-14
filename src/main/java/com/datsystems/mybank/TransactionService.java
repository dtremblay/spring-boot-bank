package com.datsystems.mybank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.datsystems.mybank.model.Transaction;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        List<Transaction> lists = new ArrayList<Transaction>();
        lists.add(new Transaction());
        return lists;
    }
    
}
