package com.bhavan.moneyApp.Portfoilo.repository;

import com.bhavan.moneyApp.Portfoilo.entity.Investor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorRepository extends JpaRepository<Investor,Long> {
}
