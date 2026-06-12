package task11;

public class Recursion {

    public static int sum(int a, int b) {
        if (b == 0) {
            return a;
        }
        return sum(++a, --b);
    }

    public static void times(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("i: " + i);
        times(--i);
    }

    public static int array_sum(int[] tab, int i) {
        if (i == 0) {
            return tab[0];
        }
        return tab[i] + array_sum(tab, i - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(6, 9));

        times(10);

        int[] numbers = {1, 2, 3, 4, 5};
        int wynik = array_sum(numbers, numbers.length - 1);
        System.out.println("Suma tablicy: " + wynik);
    }
}