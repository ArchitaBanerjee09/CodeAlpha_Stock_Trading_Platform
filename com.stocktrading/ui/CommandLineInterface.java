package com.stocktrading.ui;

import com.stocktrading.model.Trade;
import com.stocktrading.service.MarketService;
import com.stocktrading.service.PortfolioService;

import java.util.Scanner;

public class CommandLineInterface{
    private MarketService marketService;
    private PortfolioService portfolioService;
    private Scanner scanner;

    public CommandLineInterface(MarketService marketService, PortfolioService portfolioService) {
        this.marketService = marketService;
        this.portfolioService = portfolioService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Stock Trading Platform!");

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Update Market Data");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    updateMarketData();
                    break;
                case 2:
                    buyStock();
                    break;
                case 3:
                    sellStock();
                    break;
                case 4:
                    viewPortfolio();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void updateMarketData() {
        System.out.print("Enter stock symbol: ");
        String symbol = scanner.nextLine();
        System.out.print("Enter stock price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        marketService.updateMarketData(symbol, price);
        System.out.println("Market data updated for " + symbol);
    }

    private void buyStock() {
        System.out.print("Enter stock symbol: ");
        String symbol = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        portfolioService.executeTrade(new Trade(symbol, quantity, price, Trade.TradeType.BUY));
        System.out.println("Bought " + quantity + " shares of " + symbol);
    }

    private void sellStock() {
        System.out.print("Enter stock symbol: ");
        String symbol = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        portfolioService.executeTrade(new Trade(symbol, quantity, price, Trade.TradeType.SELL));
        System.out.println("Sold " + quantity + " shares of " + symbol);
    }

    private void viewPortfolio() {
        System.out.println("Current Portfolio: " + portfolioService.getPortfolio());
    }
}
