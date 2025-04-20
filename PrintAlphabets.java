// This class implements Runnable to print characters from A to E

public class PrintAlphabets implements Runnable {
    @Override
    public void run() {
        printAlphabets();
    }
    // Function to print alphabets from A to E
    public void printAlphabets() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Alphabet: " + ch);
            try {
                Thread.sleep(500); // delay for visibility
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

}
