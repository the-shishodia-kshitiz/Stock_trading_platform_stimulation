import java.util.*;

public class Portfolio {
    private Map<String, Integer> holdings = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction t) {
        transactions.add(t);
        String symbol = t.stockSymbol;
        int quantity = t.quantity;
        if (t.type.equalsIgnoreCase("BUY")) {
            holdings.put(symbol, holdings.getOrDefault(symbol, 0) + quantity);
        } else if (t.type.equalsIgnoreCase("SELL")) {
            holdings.put(symbol, holdings.getOrDefault(symbol, 0) - quantity);
        }
    }

    public void showHoldings() {
        System.out.println("Your Holdings:");
        for (Map.Entry<String, Integer> entry : holdings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " shares");
        }
    }

    public void showTransactions() {
        System.out.println("Transaction History:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}