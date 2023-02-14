package com.bhavan.moneyApp.Portfoilo.controller;

import com.bhavan.moneyApp.Portfoilo.entity.Rebalancing;
import com.bhavan.moneyApp.Portfoilo.service.RebalancingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rebalancing")
public class RebalancingController {
    @Autowired
    private RebalancingService rebalancingService;
    @PostMapping("/addRebalancing")
    public Rebalancing addrebalancing(@RequestBody Rebalancing rebalancing) {
        return rebalancingService.createRebalancing(rebalancing);
    }
    @GetMapping("/getRebalancings")
    public List<Rebalancing> findAllRebalancings() {
        return rebalancingService.getAllRebalancings();
    }
    @GetMapping("/getRebalancing/{rebalancingId}")
    public Rebalancing findRebalancingById(@PathVariable long rebalancingId) {
        return rebalancingService.getRebalancingById(rebalancingId);
    }
    @PutMapping("/updateRebalancing")
    public Rebalancing updaterebalancing(@RequestBody Rebalancing rebalancing) {
        return rebalancingService.updateRebalancing(rebalancing);
    }
    @DeleteMapping("/deleteRebalancing/{rebalancingId}")
    public String deleteRebalancing(@PathVariable Long rebalancingId) {
        return rebalancingService.deleteRebalancing(rebalancingId);
    }
}
