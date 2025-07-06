# Stock Trading Platform (Java Console Application)

## 📌 Project Overview

This project is a Java-based console application that simulates a basic stock trading platform. Users can view market data, buy and sell stocks, and track their portfolio and transaction history using object-oriented design principles.

---

## 🎯 Features

- View live (simulated) stock market data
- Buy and sell stocks based on available balance
- Track portfolio holdings and overall balance
- View detailed transaction history
- Modular OOP design for easy extension
- Can be extended with file/database storage or GUI interface

---

## 🧱 Class Structure

- **Stock.java** – Represents a stock with symbol, name, and price.
- **Transaction.java** – Logs buy/sell operations with timestamps.
- **Portfolio.java** – Maintains current stock holdings and transaction records.
- **User.java** – Represents a user with balance and their portfolio.
- **Main.java** – Menu-driven console interface for user interaction.

---

## 💻 How to Run

1. Ensure JDK is installed on your system.
2. Compile all Java files:
   ```bash
   javac *.java
   ```
3. Run the main program:
   ```bash
   java Main
   ```

---

## 🧩 Example Stocks

The program starts with the following predefined stocks:
- AAPL (Apple Inc.)
- GOOG (Alphabet Inc.)
- TSLA (Tesla Inc.)

---

## 📦 Future Enhancements

- Implement file I/O for saving/loading user data
- Integrate with a database (e.g., MySQL or SQLite)
- Add a graphical interface using JavaFX or Swing
- Real-time stock price API integration

---

## 👨‍💻 Author

Developed by: Kshitiz Shishodia  
Language: Java  
Type: Console-based Simulation Project  

---