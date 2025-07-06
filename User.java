public class User {
    private String name;
    private double balance;
    private Portfolio portfolio;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.portfolio = new Portfolio();
    }

    public void buyStock(Stock stock, int quantity) {
        double totalCost = stock.getPrice() * quantity;
        if (balance >= totalCost) {
            balance -= totalCost;
            portfolio.addTransaction(new Transaction(stock.getSymbol(), quantity, stock.getPrice(), "BUY"));
            System.out.println("Successfully bought " + quantity + " shares of " + stock.getSymbol());
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void sellStock(Stock stock, int quantity) {
        portfolio.addTransaction(new Transaction(stock.getSymbol(), quantity, stock.getPrice(), "SELL"));
        balance += stock.getPrice() * quantity;
        System.out.println("Successfully sold " + quantity + " shares of " + stock.getSymbol());
    }

    public void showPortfolio() {
        System.out.println("Balance: $" + balance);
        portfolio.showHoldings();
    }

    public void showTransactionHistory() {
        portfolio.showTransactions();
    }

    public double getBalance() {
        return balance;
    }
}