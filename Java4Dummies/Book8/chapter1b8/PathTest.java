package book8.chapter1b8;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
//        Path p = Paths.get("C:\\2022 CodingBootcamp\\Java\\movies.txt");
//        if (Files.exists(p))
//            System.out.println("file exists!");
//    }
//        try {
//            Files.createFile(p);
//            System.out.println("File created");
//        } catch (Exception e) {
//            System.out.println("File not created" + e);
//        }
        Path c = Paths.get("C:\\");
        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(c ,"*.txt");
            for (Path e: stream) {
                System.out.println(e);
            }
        }catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}