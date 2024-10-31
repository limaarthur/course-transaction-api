package com.ignitec.transaction_api.services;

import com.ignitec.transaction_api.domain.dtos.TransactionDTO;
import com.ignitec.transaction_api.domain.entities.Transaction;

import java.util.List;
import java.util.UUID;

public interface TransactionService {
    Transaction save(TransactionDTO transactionDTO);
    List<Transaction> findAll();
    Transaction findById(UUID id);
    Transaction update(UUID id, TransactionDTO transactionDTO);
    void delete(UUID id);
}
