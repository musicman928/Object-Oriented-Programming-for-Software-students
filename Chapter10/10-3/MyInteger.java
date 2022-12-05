import java.util.Arrays;

public class MyInteger {
    private int value;

    public MyInteger(int in) {
        value = in;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        boolean out = true;

        for (int i = value - 1; i > 1; i--) {
            if (value % i == 0) {out = false; break;}
        }

        return out;
    }

    public static boolean isEven(int in) {
        return in % 2 == 0;
    }

    public static boolean isOdd(int in) {
        return in % 2 != 0;
    }

    public static boolean isPrime(int in) {
        MyInteger temp = new MyInteger(in);

        return temp.isPrime();
    }

    public static boolean isEven(MyInteger in) {
        return isEven(in.getValue());
    }

    public static boolean isOdd(MyInteger in) {
        return isOdd(in.getValue());
    }

    public static boolean isPrime(MyInteger in) {
        return isPrime(in.getValue());
    }

    public boolean equals(int in) {
        return value == in;
    }

    public boolean equals(MyInteger in) {
        return value == in.getValue();
    }

    public static int parseInt(char[] in) {
        int out = 0;

        for (int i = 0; i < in.length; i++) {
            out = out * 10 + (in[i] - '0');
        }

        return out;
    }

    public static int parseInt(String in) {
        int out = 0;

        for (int i = 0; i < in.length(); i++) {
            out = out * 10 + (in.charAt(i) - '0');
        }

        return out;
    }

}