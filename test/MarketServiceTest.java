package com.stocktrading;

import com.stocktrading.model.MarketData;
import com.stocktrading.service.MarketService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarketServiceTest {
    private MarketService marketService;

    @BeforeEach
    void setUp() {
        marketService = new MarketService();
    }

    @Test
    void testUpdateAndGetMarketData() {
        marketService.updateMarketData("AAPL", 150.0);
        MarketData marketData = marketService.getMarketData("AAPL");

        assertNotNull(marketData);
        assertEquals("AAPL", marketData.getSymbol());
        assertEquals(150.0, marketData.getPrice());
    }

    @Test
    void testGetAllMarketData() {
        marketService.updateMarketData("AAPL", 150.0);
        marketService.updateMarketData("GOOGL", 2800.0);

        assertEquals(2, marketService.getAllMarketData().size());
    }
}
