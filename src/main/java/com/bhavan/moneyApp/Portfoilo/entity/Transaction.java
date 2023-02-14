package com.bhavan.moneyApp.Portfoilo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long transactionID;
    private String assetClass;
    private int assetValue;
    /*
     * @OneToMany
     *
     * @JoinColumn(name = "portfolioId", referencedColumnName = "portfolioId")
     */
    private long portfolioId;

    public Transaction(long transactionID, String assetClass, int assetValue, long portfolioId) {
        super();
        this.transactionID = transactionID;
        this.assetClass = assetClass;
        this.assetValue = assetValue;
        this.portfolioId = portfolioId;
    }

    public Transaction() {

    }

    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public int getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(int assetValue) {
        this.assetValue = assetValue;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

}
