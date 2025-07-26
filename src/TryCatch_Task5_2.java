package Task3_JavaExceptionalHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch_Task5_2 {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            File file = new File("data.txt");
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (sc != null) {
                sc.close(); // closing is a gooooddd habit!
            }
        }
    }
}
