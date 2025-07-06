import java.time.LocalDateTime;

public class Transaction {
    String stockSymbol;
    int quantity;
    double price;
    LocalDateTime timestamp;
    String type;

    public Transaction(String stockSymbol, int quantity, double price, String type) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return type + " " + quantity + " shares of " + stockSymbol + " at $" + price + " on " + timestamp;
    }
}