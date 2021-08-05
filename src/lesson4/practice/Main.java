package lesson4.practice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<File> images = new ArrayList<>();
        searchImagesFromPc(new File("C:\\"), images);
        for (File image : images) {
            System.out.println("Найдена фотография: " +
                    image.getAbsolutePath());
        }
    }

    private static void searchImagesFromPc(File rootFile,
                                           List<File> images) {
        if (rootFile.isDirectory()) {
            File[] files = rootFile.listFiles();
            if (files != null) {
                System.out.println("Поиск в папке: " +
                        rootFile.getAbsolutePath());
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchImagesFromPc(file, images);
                    } else {
                        if (file.getAbsolutePath().endsWith(".jpg")) {
                            images.add(file);
                        }
                    }
                }
            }
        }

    }
}
