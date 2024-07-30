package com.stocktrading.model;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<String, Stock> stocks = new HashMap<>();

    public void addTrade(Trade trade) {
        Stock stock = stocks.getOrDefault(trade.getSymbol(), new Stock(trade.getSymbol(), 0, 0.0));
        int newQuantity = trade.getTradeType() == Trade.TradeType.BUY
                ? stock.getQuantity() + trade.getQuantity()
                : stock.getQuantity() - trade.getQuantity();
        double newAveragePrice = (stock.getAveragePrice() * stock.getQuantity() + trade.getPrice() * trade.getQuantity()) / newQuantity;
        stock.setQuantity(newQuantity);
        stock.setAveragePrice(newAveragePrice);
        stocks.put(trade.getSymbol(), stock);
    }

    public Map<String, Stock> getStocks() {
        return stocks;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "stocks=" + stocks +
                '}';
    }
}

