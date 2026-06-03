package task08.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public
    class P1_CreatingStreams {

    public static void go() {

        printHeader("Problem P1 – Tworzenie Streamów");

        System.out.println("--- [1] Stream.of() ---");
//TODO 01

        System.out.println("\n--- [2] Arrays.stream() ---");
        String[] tags = {"java", "news", "foto", "tech"};
//TODO 02

        System.out.println("\n--- [3] Stream.iterate() – ID postów ---");
//TODO 03

        System.out.println();

        System.out.println("\n--- [4] Stream.generate() – losowe lajki ---");
        Random random = new Random(42);
//TODO 04

        System.out.println();

        System.out.println("\n--- [5] Stream.empty() + Optional ---");
//TODO 05

//        System.out.println("Czy wynik istnieje: " + result.isPresent());
//        System.out.println("Wartość lub domyślna: " + result.orElse("Brak postów"));

        System.out.println("\n--- [BONUS] Collection.stream() ---");
//TODO 06

    }

    private static void printHeader(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" " + title);
        System.out.println("=".repeat(60));
    }
}