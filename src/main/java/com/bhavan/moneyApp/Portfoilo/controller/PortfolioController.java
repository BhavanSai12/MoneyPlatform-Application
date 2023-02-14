package com.bhavan.moneyApp.Portfoilo.controller;

import com.bhavan.moneyApp.Portfoilo.entity.Portfolio;
import com.bhavan.moneyApp.Portfoilo.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/portfolio")
public class PortfolioController {
    @Autowired
    private PortfolioService portfolioService;

    @PostMapping("/addPortfolio")
    public Portfolio addportfolio(@RequestBody Portfolio portfolio) {
        return portfolioService.createPortfolio(portfolio);
    }
    @GetMapping("/getPortfolios")
    public List<Portfolio> findAllPortfolios() {
        return portfolioService.getAllPortfolios();
    }
    @PutMapping("/updatePortfolio")
    public Portfolio updateportfolio(@RequestBody Portfolio portfolio) {
        return portfolioService.updatePortfolio(portfolio);
    }
    @DeleteMapping("/deletePortfolio/{portfolioId}")
    public String deletePortfolio(@PathVariable Long portfolioId) {
        return portfolioService.deletePortfolio(portfolioId);
    }

}
