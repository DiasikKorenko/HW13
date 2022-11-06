import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String... args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D://Kurs_java//HW13//romeo-and-juliet.txt");
        System.out.printf("File size: %d bytes \n", fileInputStream.available());
        int i = -1;
        StringBuilder result = new StringBuilder();
        while ((i = fileInputStream.read()) != -1) {
            result.append((char) i);
        }
        fileInputStream.close();
        System.out.println(result);
        StringBuilder n;
        String word = " ";
        n = new StringBuilder(result.toString().replaceAll("[+=!&?.,\n]", " "));
        String[] text = n.toString().split(" ");

        for (int j = 0; j < text.length; j++) {
            if (text[j].length() > word.length()) {
                word = text[j];
            }
        }
        System.out.println("Длинное слово : " + word);
    }
}