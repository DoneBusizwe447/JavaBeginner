package book8.chapter1b8;

import javax.swing.*;
import java.io.File;

public class FileFilterTest {
    public static void main(String[] args) {
        FileFilterTest fct = new FileFilterTest();
        System.out.println("You chose " + fct.getFile());

    }
    private File getFile() {
        JFileChooser fc = new JFileChooser();

        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(new JavaFilter());
        int result = fc.showOpenDialog(null);
        File file = null;
        if (result == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
    }
        return file;
    }
}
class JavaFilter
      extends javax.swing.filechooser.FileFilter{

    @Override
    public boolean accept(File f) {
        if (f.isDirectory())
        return true;

    String name = f.getName();
    if (name.matches(".*\\.java")) {
                return true;
    }else{
        return false;
    }
    }

    @Override
    public String getDescription() {
        return "Java files (*.java)";
    }
}