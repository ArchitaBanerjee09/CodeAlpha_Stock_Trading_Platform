package com.stocktrading.service;

import com.stocktrading.model.MarketData;

import java.util.HashMap;
import java.util.Map;

public class MarketService {
    private Map<String, MarketData> marketDataMap = new HashMap<>();

    public void updateMarketData(String symbol, double price) {
        marketDataMap.put(symbol, new MarketData(symbol, price));
    }

    public MarketData getMarketData(String symbol) {
        return marketDataMap.get(symbol);
    }

    public Map<String, MarketData> getAllMarketData() {
        return marketDataMap;
    }
}
