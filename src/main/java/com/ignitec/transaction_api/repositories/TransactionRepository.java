package com.ignitec.transaction_api.repositories;

import com.ignitec.transaction_api.domain.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
