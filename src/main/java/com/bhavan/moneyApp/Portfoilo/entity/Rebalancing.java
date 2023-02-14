package com.bhavan.moneyApp.Portfoilo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rebalancing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rebalancingId;
    private int rebalancedValue;
    private int rebalancedPercentage;
    private int allocationPercentage;
    private int portfolioId;
    private int portfolioValue;

    public Rebalancing(long rebalancingId, int rebalancedValue, int rebalancedPercentage, int allocationPercentage, int portfolioId, int portfolioValue) {
        this.rebalancingId = rebalancingId;
        this.rebalancedValue = rebalancedValue;
        this.rebalancedPercentage = rebalancedPercentage;
        this.allocationPercentage = allocationPercentage;
        this.portfolioId = portfolioId;
        this.portfolioValue = portfolioValue;
    }

    public long getRebalancingId() {
        return rebalancingId;
    }

    public void setRebalancingId(long rebalancingId) {
        this.rebalancingId = rebalancingId;
    }

    public int getRebalancedValue() {
        return rebalancedValue;
    }

    public void setRebalancedValue(int rebalancedValue) {
        this.rebalancedValue = rebalancedValue;
    }

    public int getRebalancedPercentage() {
        return rebalancedPercentage;
    }

    public void setRebalancedPercentage(int rebalancedPercentage) {
        this.rebalancedPercentage = rebalancedPercentage;
    }

    public int getAllocationPercentage() {
        return allocationPercentage;
    }

    public void setAllocationPercentage(int allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(int portfolioId) {
        this.portfolioId = portfolioId;
    }

    public int getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(int portfolioValue) {
        this.portfolioValue = portfolioValue;
    }
}
