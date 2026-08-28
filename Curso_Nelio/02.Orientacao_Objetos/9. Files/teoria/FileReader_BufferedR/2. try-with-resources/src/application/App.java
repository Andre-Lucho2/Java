package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String path = "/home/deco-dev/Documentos/Metroidvania.md";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}