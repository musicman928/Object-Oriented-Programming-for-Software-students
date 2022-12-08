import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle tri = new Triangle(promptDouble("Enter the value for side A"),promptDouble("Enter the value for side B"),promptDouble("Enter the value for side C"),promptString("Enter the color of the triangle"),promptBoolean("Enter (true/false) if the triangle is filled"));

        System.out.println(tri);
    }

    public static double promptDouble(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s: ",prompt);
        double temp = in.nextDouble();
        System.out.println();

        return temp;
    }

    public static boolean promptBoolean(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s: ",prompt);
        boolean temp = in.nextBoolean();
        System.out.println();

        return temp;
    }

    public static String promptString(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s: ",prompt);
        String temp = in.nextLine();
        System.out.println();

        return temp;
    }
}
