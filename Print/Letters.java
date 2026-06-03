package task09a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Letters implements Iterable<Thread> {

    private List<Thread> threads;
    private List<LetterPrinter> printers;

    public Letters(String letters) {
        threads = new ArrayList<>();
        printers = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            LetterPrinter printer = new LetterPrinter(letter);
            Thread thread = new Thread(printer, "Thread " + letter);

            printers.add(printer);
            threads.add(thread);
        }
    }

    public void start() {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public void stop() {
        for (LetterPrinter printer : printers) {
            printer.stopRunning();
        }
        for (Thread thread : threads) {
            thread.interrupt();
        }
    }

    @Override
    public Iterator<Thread> iterator() {
        return threads.iterator();
    }
}