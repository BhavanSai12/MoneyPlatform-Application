package com.bhavan.moneyApp.Portfoilo.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

//This class represents the Investor entity in our money platform
@Entity
public class Investor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long investorId;
    private String investorName;
    private String investorEmail;
    private String investorPhone;

//    @OneToMany(mappedBy="investor")
//    private List<Portfolio> portfolio;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "investorID", referencedColumnName = "investorId")
    Set<Portfolio> portfolio = new HashSet<>();


    public Investor(long investorId, String investorName, String investorEmail, String investorPhone) {
        this.investorId = investorId;
        this.investorName = investorName;
        this.investorEmail = investorEmail;
        this.investorPhone = investorPhone;
    }

    public Investor() {
    }

    public long getInvestorId() {
        return investorId;
    }

    public void setInvestorId(long investorId) {
        this.investorId = investorId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public String getInvestorEmail() {
        return investorEmail;
    }

    public void setInvestorEmail(String investorEmail) {
        this.investorEmail = investorEmail;
    }

    public String getInvestorPhone() {
        return investorPhone;
    }

    public void setInvestorPhone(String investorPhone) {
        this.investorPhone = investorPhone;
    }
}
