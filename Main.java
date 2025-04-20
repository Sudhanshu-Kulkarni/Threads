// Name: Sudhanshu Kulkarni
// PRN: 23070126132
// Batch: B3

// This is the main file that initiates all threads.

public class Main {
    public static void main(String[] args) {
        // Creating thread objects
        Thread numbersThread = new Thread(new PrintNumbers());
        Thread alphabetsThread = new Thread(new PrintAlphabets());

        // Starting the threads
        numbersThread.start();
        alphabetsThread.start();
    }
}
