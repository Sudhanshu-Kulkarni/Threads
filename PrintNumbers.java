// This class implements Runnable to print numbers from 1 to 5 using a separate thread

public class PrintNumbers implements Runnable {
    @Override
    public void run() {
        printNumbers();
    }

    // Function to print numbers from 1 to 5
    public void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // delay for visibility
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
