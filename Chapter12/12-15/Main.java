import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        int[] array = new int[100];
        Random randy = new Random();
        File data = new File("data.txt");
        PrintWriter writer = new PrintWriter(data);
        Scanner read = new Scanner(data);

        //fill array with random numbers
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = randy.nextInt(10);
        }

        //print array to text file
        for (int i = 0; i < array.length - 1; i++) {
            writer.print(array[i] + " ");
        }

        writer.close();


        int[] dataout = new int[0];

        while (read.hasNext()) {
            //adds next integer to the end of dataout
            int[] temp = dataout.clone();
            dataout = new int[temp.length + 1];
            System.arraycopy(temp,0,dataout,0,temp.length);
            dataout[temp.length] = read.nextInt();
        }

        Arrays.sort(dataout);
        System.out.println(Arrays.toString(dataout));

    }
}
