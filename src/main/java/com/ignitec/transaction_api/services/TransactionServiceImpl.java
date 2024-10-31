package com.ignitec.transaction_api.services;

import com.ignitec.transaction_api.domain.dtos.TransactionDTO;
import com.ignitec.transaction_api.domain.entities.Transaction;

import java.util.List;
import java.util.UUID;

public class TransactionServiceImpl implements TransactionService{
    @Override
    public Transaction save(TransactionDTO transactionDTO) {
        return null;
    }

    @Override
    public List<Transaction> findAll() {
        return List.of();
    }

    @Override
    public Transaction findById(UUID id) {
        return null;
    }

    @Override
    public Transaction update(UUID id, TransactionDTO transactionDTO) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
