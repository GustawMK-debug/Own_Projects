package task08.tasks;

import task08.data.TestData;
import task08.model.Post;

import java.util.List;
import java.util.stream.Collectors;

public
    class P2_FilterAndMap {

    public static void go() {

        printHeader("Problem P2 – filter(), map(), distinct()");

        List<Post> posts = TestData.getPosts();

        System.out.println("--- [1] Posty kategorii TECH (pierwsze 40 znaków) ---");
//TODO 07

        System.out.println("\n--- [2] Unikalni autorzy postów (distinct) ---");
//TODO 08

        System.out.println("\n--- [3] Posty z ponad 200 lajkami ---");
//TODO 09

        System.out.println("\n--- [4] Treści postów WIELKIMI LITERAMI ---");
//TODO 10

    }

    private static void printHeader(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" " + title);
        System.out.println("=".repeat(60));
    }
}