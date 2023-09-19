package book8.chapter1b8;

import java.io.File;

public class ListDirectory {
    public static void main(String[] args) {
        if (args.length > 0) {
            File dir = new File(args[0]);
            if (dir.isDirectory()) {
                File[] list = dir.listFiles();
                for(File f: list) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}
