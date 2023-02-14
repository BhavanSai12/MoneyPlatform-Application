package com.bhavan.moneyApp.Portfoilo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfolioId;
    private int investorId;
    private int portfolioValue;
    private int allocationPercentage;

    public Portfolio(long portfolioId, int investorId, int portfolioValue, int allocationPercentage) {
        this.portfolioId = portfolioId;
        this.investorId = investorId;
        this.portfolioValue = portfolioValue;
        this.allocationPercentage = allocationPercentage;
    }

    public Portfolio() {
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public int getInvestorId() {
        return investorId;
    }

    public void setInvestorId(int investorId) {
        this.investorId = investorId;
    }

    public int getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(int portfolioValue) {
        this.portfolioValue = portfolioValue;
    }

    public int getAllocationPercentage() {
        return allocationPercentage;
    }

    public void setAllocationPercentage(int allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
    }
}
