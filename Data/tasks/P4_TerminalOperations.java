package task08.tasks;

import task08.data.TestData;
import task08.model.Post;
import task08.model.User;

import java.util.List;
import java.util.Optional;

public
    class P4_TerminalOperations {

    public static void go() {

        printHeader("Problem P4 – Operacje Terminalne");

        List<Post> posts = TestData.getPosts();
        List<User> users = TestData.getUsers();

        System.out.println("--- [1] count() – liczba postów NEWS ---");
//TODO 16

        //System.out.println("Liczba postów NEWS: " + newsCount);

        System.out.println("\n--- [2] anyMatch() – czy jest post z tagiem 'docker'? ---");
//TODO 17

        //System.out.println("Czy jest post z 'docker': " + hasDocker);

        System.out.println("\n--- [3] allMatch() – czy wszystkie mają przynajmniej 1 komentarz? ---");
//TODO 18

        //System.out.println("Czy wszystkie mają komentarze: " + allHaveComments);

        System.out.println("\n--- [4] noneMatch() – czy żaden post nie ma ujemnych lajków? ---");
//TODO 19

        //System.out.println("Czy żaden nie ma ujemnych lajków: " + noNegativeLikes);

        System.out.println("\n--- [5] findFirst() – pierwszy post LIFESTYLE ---");
//TODO 20

        //System.out.println("Treść (orElse): " + content);

        System.out.println("\n--- [6] findFirst() – niezweryfikowany użytkownik z Krakowa ---");
//TODO 21


        System.out.println("\n--- [7] Optional – demonstracja metod ---");
//TODO 22

    }

    private static void printHeader(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" " + title);
        System.out.println("=".repeat(60));
    }
}