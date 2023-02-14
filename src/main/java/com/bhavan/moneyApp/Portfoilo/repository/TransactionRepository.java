package com.bhavan.moneyApp.Portfoilo.repository;
import com.bhavan.moneyApp.Portfoilo.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
