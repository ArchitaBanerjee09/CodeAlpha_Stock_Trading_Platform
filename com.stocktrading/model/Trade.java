package com.stocktrading.model;

public class Trade {
    private String symbol;
    private int quantity;
    private double price;
    private TradeType tradeType;

    public enum TradeType {
        BUY,
        SELL
    }

    public Trade(String symbol, int quantity, double price, TradeType tradeType) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.tradeType = tradeType;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public TradeType getTradeType() {
        return tradeType;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", tradeType=" + tradeType +
                '}';
    }
}