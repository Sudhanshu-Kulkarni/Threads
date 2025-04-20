# Java Multithreading

## 📌 Description
This project demonstrates **basic multithreading in Java** using two threads:
- One thread prints **numbers from 1 to 5**
- Another thread prints **alphabets from A to E**

Each thread uses a small delay (`Thread.sleep`) to show parallel execution more clearly in the console output.

## 🧹 Project Structure

```
PrintNumbers.java        // Runnable class to print numbers
PrintAlphabets.java      // Runnable class to print alphabets
Main.java                // Main class to run both threads
```

## 🧵 How It Works

- `PrintNumbers` and `PrintAlphabets` implement `Runnable`.
- Two `Thread` objects are created using these classes.
- When started, both threads run concurrently and display outputs in an interleaved way.

## ▶️ How to Run

1. Compile the Java files:
   ```bash
   javac PrintNumbers.java PrintAlphabets.java Main.java
   ```

2. Run the main program:
   ```bash
   java Main
   ```
