package lesson4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world!\nGoodbuy world!";
        byte[] data = text.getBytes();
        File file = new File("C:/java-practice/1.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // new variant
//            List<String> lines =
//                    Files.readAllLines(Paths.get(file.getAbsolutePath()));
//            for (String line : lines) {
//                System.out.println(line);
//            }
            FileInputStream fis = new FileInputStream(file);
            String textFromFile = "";
            int i;
            while((i=fis.read())!= -1){
                System.out.print((char)i);
            }
            System.out.println(textFromFile);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
