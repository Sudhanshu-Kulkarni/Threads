// Name: Sudhanshu Kulkarni
// PRN: 23070126132
// Batch: B3

// This is the main file that initiates all threads.

public class Main {
    public static void main(String[] args) {
        // Create threads for numbers and alphabets
        Thread numbersThread = new Thread(new PrintNumbers());
        Thread alphabetsThread = new Thread(new PrintAlphabets());

        // Start both threads
        numbersThread.start();
        alphabetsThread.start();
    }
}
