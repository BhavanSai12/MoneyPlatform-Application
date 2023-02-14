package com.bhavan.moneyApp.Portfoilo.controller;

import com.bhavan.moneyApp.Portfoilo.entity.Investor;
import com.bhavan.moneyApp.Portfoilo.exception.ResourceNotFoundException;
import com.bhavan.moneyApp.Portfoilo.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/investor")
public class InvestorController {
    @Autowired
    private InvestorService investorService;
    @PostMapping("/addInvestor")
    public Investor addInvestor(@RequestBody Investor investor){
        return investorService.createInvestor(investor);
    }
    @GetMapping("/getInvestors")
    public List<Investor>findAllInvestors(){
        return investorService.getAllInvestors();
    }
    @GetMapping("/getInvestor/{investorId}")
    public Investor findInvestorById(@PathVariable long investorId) throws ResourceNotFoundException
    {
        return investorService.getInvestorById(investorId);
    }

    @PutMapping("/updateInvestor")
    public Investor updateInvestor(@RequestBody Investor investor){
        return investorService.updateInvestor(investor);
    }
    @DeleteMapping("/deleteInvestor/{investorId}")
    public String deleteInvestor(@PathVariable Long investorId) {
        return investorService.deleteInvestor(investorId);
    }

}
