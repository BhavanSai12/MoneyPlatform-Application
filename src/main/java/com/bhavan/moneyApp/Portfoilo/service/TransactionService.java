package com.bhavan.moneyApp.Portfoilo.service;

import com.bhavan.moneyApp.Portfoilo.entity.Transaction;
import com.bhavan.moneyApp.Portfoilo.exception.ResourceNotFoundException;
import com.bhavan.moneyApp.Portfoilo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAlltransactions() {
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(Long transactionId) {
        return transactionRepository.findById(transactionId).orElseThrow(
                () -> new ResourceNotFoundException(String.format("	TRANSACTION ID %d not found", transactionId)));
    }

    public Transaction updateTransaction(Transaction transactionId) {
        Transaction existingTransaction = transactionRepository.findById(transactionId.getTransactionID()).orElse(null);
        existingTransaction.setAssetClass(transactionId.getAssetClass());
        existingTransaction.setAssetValue(transactionId.getAssetValue());
        existingTransaction.setPortfolioId(transactionId.getPortfolioId());
        return transactionRepository.save(existingTransaction);

    }

    public String deleteTransaction(Long transactionId) {
        transactionRepository.deleteById(transactionId);
        return "transaction removed" + transactionId;
    }
}
