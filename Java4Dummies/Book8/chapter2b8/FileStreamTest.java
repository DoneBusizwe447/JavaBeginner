package book8.chapter2b8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileStreamTest {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\magni\\IdeaProjects\\Java4dummies\\src\\book8\\chapter2b8\\movies.txt");
            BufferedReader in = new BufferedReader(new FileReader(f));
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }

        } catch (Exception e) {
            System.out.println("Error "+ e);
        }
    }
}
