import java.util.*;

public class Main {
    static Map<String, Stock> stockMarket = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        setupStocks();
        User user = new User("Alice", 10000);

        while (true) {
            System.out.println("\n--- Stock Trading Platform ---");
            System.out.println("1. View Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. View Transactions");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> viewStocks();
                case 2 -> buyStock(user);
                case 3 -> sellStock(user);
                case 4 -> user.showPortfolio();
                case 5 -> user.showTransactionHistory();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void setupStocks() {
        stockMarket.put("AAPL", new Stock("AAPL", "Apple Inc.", 150));
        stockMarket.put("GOOG", new Stock("GOOG", "Alphabet Inc.", 2800));
        stockMarket.put("TSLA", new Stock("TSLA", "Tesla Inc.", 700));
    }

    private static void viewStocks() {
        System.out.println("Available Stocks:");
        for (Stock stock : stockMarket.values()) {
            System.out.println(stock);
        }
    }

    private static void buyStock(User user) {
        System.out.print("Enter stock symbol: ");
        String symbol = scanner.next().toUpperCase();
        Stock stock = stockMarket.get(symbol);
        if (stock == null) {
            System.out.println("Stock not found.");
            return;
        }
        System.out.print("Enter quantity to buy: ");
        int qty = scanner.nextInt();
        user.buyStock(stock, qty);
    }

    private static void sellStock(User user) {
        System.out.print("Enter stock symbol: ");
        String symbol = scanner.next().toUpperCase();
        Stock stock = stockMarket.get(symbol);
        if (stock == null) {
            System.out.println("Stock not found.");
            return;
        }
        System.out.print("Enter quantity to sell: ");
        int qty = scanner.nextInt();
        user.sellStock(stock, qty);
    }
}