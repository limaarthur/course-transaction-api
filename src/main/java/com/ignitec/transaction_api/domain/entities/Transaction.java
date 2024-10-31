package com.ignitec.transaction_api.domain.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transaction;
    private BigDecimal total;
    private LocalDateTime createdAt;
    private String cardNumber;
    private String ccv;
    private String owner;
    private String eim;

    public Transaction() {
    }

    public Transaction(UUID transaction, BigDecimal total, LocalDateTime createdAt, String cardNumber, String ccv, String owner, String eim) {
        this.transaction = transaction;
        this.total = total;
        this.createdAt = createdAt;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.owner = owner;
        this.eim = eim;
    }

    public UUID getTransaction() {
        return transaction;
    }

    public void setTransaction(UUID transaction) {
        this.transaction = transaction;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEim() {
        return eim;
    }

    public void setEim(String eim) {
        this.eim = eim;
    }
}
