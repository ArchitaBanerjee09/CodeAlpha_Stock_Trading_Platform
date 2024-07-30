# Stock Trading Platform

## Overview

The Stock Trading Platform is a simulated application that allows users to interact with market data, execute trades (buy/sell stocks), and manage a portfolio. The application is built using Java and is structured to be beginner-friendly, with a focus on clean architecture and testability.

## Project Structure

The project is organized into the following packages:
  - com.stocktrading.model : Contains the data models used in the application, such as MarketData, Stock, Trade, and Portfolio.
  - com.stocktrading.service : Contains the service classes that manage the business logic, such as MarketService and PortfolioService.
  - com.stocktrading.ui : Contains the user interface class, CommandLineInterface, which handles user interaction.
  - com.stocktrading : The root package containing the main entry point of the application, Main.java.

## Packages and Classes

### com.stocktrading.model

  - MarketData: Represents the market data for a stock, including its symbol and price.
  - Stock: Represents a stock in the user's portfolio, including its symbol, quantity, and average price.
  - Trade: Represents a trade operation, including its symbol, quantity, price, and trade type (BUY/SELL).
  -  Portfolio: Manages the collection of stocks owned by the user.

### com.stocktrading.service

  - MarketService: Manages the market data, allowing updates and retrieval of stock prices.
  - PortfolioService: Manages the portfolio, including executing trades and retrieving portfolio information.

### com.stocktrading.ui

  - CommandLineInterface: Provides a command-line interface for user interaction, allowing users to update market data, buy/sell stocks, and view their portfolio.

### com.stocktrading

  - Main: The main class that initializes the services and starts the command-line interface.

## Requirements
  - Java 8 or higher
  - IntelliJ IDEA (or any other Java IDE)
  - Maven (for dependency management and build)

### Getting Started
## Setup

1. Clone the repository:

  - git clone https://github.com/yourusername/StockTradingPlatform.git

2. Open the project in IntelliJ IDEA:
  - Select "Open" and navigate to the cloned repository.
  - Click "OK" to open the project.

3.Build the project:
   - IntelliJ will automatically import the Maven dependencies specified in the pom.xml file.
   -Build the project by clicking on "Build" in the top menu and selecting "Build Project".

## Running the Application
1. Run the Main Application:

  - Navigate to src/main/java/com/stocktrading/Main.java.
  - Right-click on Main.java and select "Run 'Main.main()'".

2.Interacting with the Application:

  - The command-line interface will prompt you with options to update market data, buy stocks, sell stocks, view the portfolio, or exit the application.
  - Follow the prompts to perform various actions.

## Running Tests
1.Run All Tests:
  - Navigate to the test directory.
  - Right-click on the test directory and select "Run 'All Tests'".
  - IntelliJ will execute all the tests, and the results will be displayed in the "Run" window.

## Sample Commands:
 - Update Market Data:
   ```bash
   Enter stock symbol: AAPL
   Enter stock price: 150.0
   ```
 - Buy Stock:
    ```bash
    Enter stock symbol: AAPL
    Enter quantity: 10
    Enter price: 150.0
     ```
-  View Portfolio:
   ```bash
     Current Portfolio: Portfolio{stocks={AAPL=Stock{symbol='AAPL', quantity=10, averagePrice=150.0}}}
   ```
## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.
   
## License

This project is licensed under the MIT License - see the LICENSE file for details.

    
   
   

  
