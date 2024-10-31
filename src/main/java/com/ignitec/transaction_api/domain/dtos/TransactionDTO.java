package com.ignitec.transaction_api.domain.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDTO {
    private BigDecimal total;
    private LocalDateTime createdAt;
    private String cardNumber;
    private String ccv;
    private String owner;
    private String eim;

    public TransactionDTO() {
    }

    public TransactionDTO(LocalDateTime createdAt, BigDecimal total, String cardNumber, String ccv, String owner, String eim) {
        this.createdAt = createdAt;
        this.total = total;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.owner = owner;
        this.eim = eim;
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
