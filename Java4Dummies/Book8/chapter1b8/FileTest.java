package book8.chapter1b8;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
//        File f = new File("C:\\Users\\magni\\OneDrive\\Documents\\course");
//        if(f.exists()) {
//            System.out.println("does exist");

//
//        File f = new File("C:\\Users\\magni\\OneDrive\\Desktop\\hitslog");
//        try {
//            if (f.createNewFile()) {
//                System.out.println("file created");
//            } else {
//                System.out.println("File could not be created");
//            }
//        } catch (Exception e) {
//            System.out.println("error creating file" + e);
//        }
//

//        File dir = new File("C:\\Users\\magni\\IdeaProjects");
//        if (dir.isDirectory()) {
//            File[] files = dir.listFiles();
//            for (File f : files) {
//                System.out.println(f.getName());
//            }
//        }
//
//        File dir = new File("C:\\Users\\magni\\OneDrive\\Desktop\\hits.log");
//
//        if(dir.renameTo(new File("C:\\Users\\magni\\OneDrive\\Desktop\\hits2.log"))) {
//            System.out.println("File renamed");
//        }else{
//            System.out.println("rename failed");
//        }

        File f = new File("C:\\Users\\magni\\OneDrive\\Desktop\\hits2.log");
        if (f.delete())
            System.out.println("File deleted.");
        else
            System.out.println("File not deleted.");
    }
}
