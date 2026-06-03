package task08.tasks;

import task08.data.TestData;
import task08.model.Post;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public
    class P5_CollectBasic {

    public static void go() {

        printHeader("Problem P5 – collect() podstawowe");

        List<Post> posts = TestData.getPosts();

//TODO 23

        //System.out.println("Liczba postów TECH: " + techPosts.size());
//TODO 24

        System.out.println("\n--- [2] toSet() – unikalne kategorie ---");
//TODO 25

        //System.out.println("Unikalne kategorie: " + categories);

        System.out.println("\n--- [2b] Porównanie List vs Set z duplikatami ---");
//TODO 26

        //System.out.println("List (z duplikatami): " + authorsList.size() + " elementów -> " + authorsList);
        //System.out.println("Set  (bez duplikatów): " + authorsSet.size() + " elementów -> " + authorsSet);


        System.out.println("\n--- [3] toMap() – id posta -> liczba lajków ---");
//TODO 27

        System.out.println("\n--- [4] Lista autorów (z duplikatami) ---");
//TODO 28

        System.out.println("\n--- [BONUS] toUnmodifiableList() ---");
//TODO 29

    }

    private static void printHeader(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" " + title);
        System.out.println("=".repeat(60));
    }
}