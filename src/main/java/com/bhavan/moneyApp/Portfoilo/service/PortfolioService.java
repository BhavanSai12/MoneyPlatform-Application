package com.bhavan.moneyApp.Portfoilo.service;

import com.bhavan.moneyApp.Portfoilo.entity.Portfolio;
import com.bhavan.moneyApp.Portfoilo.exception.ResourceNotFoundException;
import com.bhavan.moneyApp.Portfoilo.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {
    @Autowired
    private PortfolioRepository portfolioRepository;

    public Portfolio createPortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }

    public Portfolio getPortfolioById(Long portfolioID) {
        return portfolioRepository.findById(portfolioID).orElseThrow(
                () -> new ResourceNotFoundException(String.format("PORTFOLIO ID %d not found", portfolioID)));
    }

    public Portfolio updatePortfolio(Portfolio portfolioID) {
        Portfolio existingPortfolio = portfolioRepository.findById(portfolioID.getPortfolioId()).orElse(null);
        existingPortfolio.setAllocationPercentage(portfolioID.getAllocationPercentage());
        existingPortfolio.setPortfolioValue(portfolioID.getPortfolioValue());
//		existingPortfolio.setInvestorId(portfolioID.getInvestorId());
        return portfolioRepository.save(existingPortfolio);

    }

    public String deletePortfolio(Long portfolioId) {
        portfolioRepository.deleteById(portfolioId);
        return "portfolio removed" + portfolioId;
    }
}
