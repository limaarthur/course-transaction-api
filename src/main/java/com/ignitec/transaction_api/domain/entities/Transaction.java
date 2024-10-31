package com.ignitec.transaction_api.domain.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transaction;
}
