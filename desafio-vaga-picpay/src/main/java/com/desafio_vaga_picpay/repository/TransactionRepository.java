package com.desafio_vaga_picpay.repository;

import com.desafio_vaga_picpay.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
