package com.bhavan.moneyApp.Portfoilo.service;

import com.bhavan.moneyApp.Portfoilo.entity.Rebalancing;
import com.bhavan.moneyApp.Portfoilo.exception.ResourceNotFoundException;
import com.bhavan.moneyApp.Portfoilo.repository.RebalancingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebalancingService {
    @Autowired
    private RebalancingRepository rebalancingRepository;

    public Rebalancing createRebalancing(Rebalancing rebalancing) {
        return rebalancingRepository.save(rebalancing);
    }

    public List<Rebalancing> getAllRebalancings() {
        return rebalancingRepository.findAll();
    }

    public Rebalancing getRebalancingById(Long rebalancingId) {
        return rebalancingRepository.findById(rebalancingId).orElseThrow(
                () -> new ResourceNotFoundException(String.format("REBALANCING ID %d not found", rebalancingId)));
    }

    public Rebalancing updateRebalancing(Rebalancing rebalancingId) {
        Rebalancing existingRebalancing = rebalancingRepository.findById(rebalancingId.getRebalancingId()).orElse(null);
        existingRebalancing.setAllocationPercentage(rebalancingId.getAllocationPercentage());
        existingRebalancing.setRebalancedValue(rebalancingId.getRebalancedValue());
        existingRebalancing.setRebalancedPercentage(rebalancingId.getRebalancedPercentage());
        existingRebalancing.setRebalancedValue(rebalancingId.getRebalancedValue());
        existingRebalancing.setPortfolioValue(rebalancingId.getPortfolioValue());
        existingRebalancing.setPortfolioId(rebalancingId.getPortfolioId());
        return rebalancingRepository.save(existingRebalancing);

    }

    public String deleteRebalancing(Long rebalancingId) {
        rebalancingRepository.deleteById(rebalancingId);
        return "rebalancing removed" + rebalancingId;
    }
}
