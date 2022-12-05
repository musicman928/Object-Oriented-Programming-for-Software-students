import java.lang.Math.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int testvalue = (int) (Math.random() * 20);
        MyInteger test = new MyInteger(testvalue);


        System.out.print("testvalue = " + testvalue + "\n\n");

        System.out.print("Testing getValue... \n" + test.getValue() + "\n\n");

        System.out.print("Testing isEven... \n" + ((test.isEven()) ? "true\n\n" : "false\n\n"));

        System.out.print("Testing isOdd... \n" + ((test.isOdd()) ? "true\n\n" : "false\n\n"));

        System.out.print("Testing isPrime... \n" + ((test.isPrime()) ? "true\n\n" : "false\n\n"));


        testvalue = (int) (Math.random() * 20);
        System.out.print("testvalue = " + testvalue + "\n\n");

        System.out.print("Testing isEven... \n" + ((test.isEven(testvalue)) ? "true\n\n" : "false\n\n"));


        testvalue = (int) (Math.random() * 20);
        System.out.print("testvalue = " + testvalue + "\n\n");

        System.out.print("Testing isOdd... \n" + ((test.isOdd(testvalue)) ? "true\n\n" : "false\n\n"));


        testvalue = (int) (Math.random() * 20);
        System.out.print("testvalue = " + testvalue + "\n\n");

        System.out.print("Testing isPrime... \n" + ((test.isPrime(testvalue)) ? "true\n\n" : "false\n\n"));



        testvalue = (int) (Math.random() * 20);
        MyInteger eventest = new MyInteger(testvalue);
        System.out.print("testvalue = " + testvalue + "\n\n");


        System.out.print("Testing isEven... \n" + ((eventest.isEven(testvalue)) ? "true\n\n" : "false\n\n"));


        testvalue = (int) (Math.random() * 20);
        MyInteger oddtest = new MyInteger(testvalue);
        System.out.print("testvalue = " + testvalue + "\n\n");

        System.out.print("Testing isOdd... \n" + ((test.isOdd(testvalue)) ? "true\n\n" : "false\n\n"));


        testvalue = (int) (Math.random() * 20);

        System.out.print("testvalue = " + testvalue + "\n\n");

        System.out.print("Testing isPrime... \n" + ((test.isPrime(testvalue)) ? "true\n\n" : "false\n\n"));


        MyInteger testa = new MyInteger(20);
        System.out.print("Testing equals... \n" + ((testa.equals(20)) ? "true\n\n" : "false\n\n"));

        MyInteger testb = new MyInteger(7);
        MyInteger testc = new MyInteger(7);

        System.out.print("Testing equals... \n" + ((testb.equals(testc)) ? "true\n\n" : "false\n\n"));


        char[] parseinttest = {'1', '2', '5', '6', '4', '3', '8', '9', '0'};

        System.out.println(parseinttest);

        System.out.println("Result: " + MyInteger.parseInt(parseinttest) + "\n");

        String testString = "123715723";

        System.out.println(testString);

        System.out.println("Result: " + MyInteger.parseInt(testString) + "\n");

        System.out.println();




        testvalue = 3;
        System.out.print("testvalue = " + testvalue + "\n\n");

        boolean out = true;
        for (int i = testvalue - 1; i > 1; i--) {
            if (testvalue % i == 0) {out = false; break;}
        }

        System.out.println(out);


    }

}
