import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[100];
        Random randy = new Random(987324021);
        Scanner in = new Scanner(System.in);
        int index;

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = randy.nextInt(9);
        }

        System.out.print("Enter an array index: ");

        index = in.nextInt();

        try {
            System.out.printf("Value: %d", array[index]);
        } catch (Exception e) {
            System.out.println("Index out of bounds");
        }

    }
}
