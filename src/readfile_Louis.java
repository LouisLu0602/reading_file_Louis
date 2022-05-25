import java.io.File;
import java.io.FileInputStream;


public class readfile_Louis {
    public static void count(String Name) throws Exception{
        int count =0;
        File file = new File("https://www.learningcontainer.com/wp-content/uploads/2020/04/sample-text-file.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] Array = new byte[(int)file.length()];
        fis.read(Array);
        String s = new String(Array);
        String [] space = s.split(" ");
        for (int i=0; i<space.length; i++) {
            count++;
        }
        System.out.println("Number of characters in the given file are " +count);
    }

}
