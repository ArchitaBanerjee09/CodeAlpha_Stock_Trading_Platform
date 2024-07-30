package com.stocktrading;

import com.stocktrading.model.Portfolio;
import com.stocktrading.model.Trade;
import com.stocktrading.service.PortfolioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PortfolioServiceTest {
    private PortfolioService portfolioService;

    @BeforeEach
    void setUp() {
        portfolioService = new PortfolioService();
    }

    @Test
    void testExecuteBuyTrade() {
        Trade buyTrade = new Trade("AAPL", 10, 150.0, Trade.TradeType.BUY);
        portfolioService.executeTrade(buyTrade);

        Portfolio portfolio = portfolioService.getPortfolio();
        assertTrue(portfolio.getStocks().containsKey("AAPL"));
        assertEquals(10, portfolio.getStocks().get("AAPL").getQuantity());
        assertEquals(150.0, portfolio.getStocks().get("AAPL").getAveragePrice());
    }

    @Test
    void testExecuteSellTrade() {
        Trade buyTrade = new Trade("AAPL", 10, 150.0, Trade.TradeType.BUY);
        portfolioService.executeTrade(buyTrade);

        Trade sellTrade = new Trade("AAPL", 5, 155.0, Trade.TradeType.SELL);
        portfolioService.executeTrade(sellTrade);

        Portfolio portfolio = portfolioService.getPortfolio();
        assertTrue(portfolio.getStocks().containsKey("AAPL"));
        assertEquals(5, portfolio.getStocks().get("AAPL").getQuantity());
        assertEquals((150.0 * 10 + 155.0 * 5) / 15, portfolio.getStocks().get("AAPL").getAveragePrice());
    }
}

