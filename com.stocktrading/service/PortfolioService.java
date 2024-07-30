package com.stocktrading.service;

import com.stocktrading.model.Portfolio;
import com.stocktrading.model.Trade;

public class PortfolioService {
    private Portfolio portfolio = new Portfolio();

    public void executeTrade(Trade trade) {
        portfolio.addTrade(trade);
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
}