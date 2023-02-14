package com.bhavan.moneyApp.Portfoilo.controller;

import com.bhavan.moneyApp.Portfoilo.entity.Transaction;
import com.bhavan.moneyApp.Portfoilo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @PostMapping("/addTransaction")
    public Transaction addtransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }
    @GetMapping("/getTransactions")
    public List<Transaction> findAlltransactions() {
        return transactionService.getAlltransactions();
    }
    @GetMapping("/getTransaction/{transactionId}")
    public Transaction findTransactionById(@PathVariable long transactionId) {
        return transactionService.getTransactionById(transactionId);
    }
    @PutMapping("/updateTransaction")
    public Transaction updatetransaction(@RequestBody Transaction transaction) {
        return transactionService.updateTransaction(transaction);
    }
    @DeleteMapping("/deleteTransaction/{transactionId}")
    public String deleteTransaction(@PathVariable Long transactionId) {
        return transactionService.deleteTransaction(transactionId);
    }


}
