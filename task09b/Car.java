package task09b;

import java.util.Random;

public class Car implements Runnable {

    private String number;
    private Parking parking;
    private Random random = new Random();

    public Car(String number, Parking parking) {
        this.number = number;
        this.parking = parking;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(random.nextInt(3000));
            int level = parking.enter(number);

            long parkingTime = 2000 + random.nextInt(3000);
            Thread.sleep(parkingTime);

            parking.exit(number, level);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Car " + number + " was interrupted.");
        }
    }
}