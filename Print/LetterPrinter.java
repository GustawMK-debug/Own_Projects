package task09a;

public class LetterPrinter implements Runnable {

    private char letter;
    private boolean running = true;

    public LetterPrinter(char letter) {
        this.letter = letter;
    }

    public synchronized void stopRunning() {
        this.running = false;
    }

    private synchronized boolean isRunning() {
        return running;
    }

    @Override
    public void run() {
        while (isRunning()) {
            System.out.print(letter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}