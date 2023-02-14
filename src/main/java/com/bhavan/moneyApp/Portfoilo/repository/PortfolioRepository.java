package com.bhavan.moneyApp.Portfoilo.repository;

import com.bhavan.moneyApp.Portfoilo.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio,Long> {
}
