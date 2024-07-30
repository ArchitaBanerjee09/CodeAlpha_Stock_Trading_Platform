package com.stocktrading;

import com.stocktrading.service.MarketService;
import com.stocktrading.service.PortfolioService;
import com.stocktrading.ui.CommandLineInterface;

public class Main {
    public static void main(String[] args) {
        MarketService marketService = new MarketService();
        PortfolioService portfolioService = new PortfolioService();
        CommandLineInterface cli = new CommandLineInterface(marketService, portfolioService);

        cli.start();
    }
}