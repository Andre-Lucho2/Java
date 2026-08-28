package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String path = "/mnt/65c22663-2276-4491-a595-2fb49f6b1e8c/Programacao/Aulas-teoricas/Java/Curso_Nelio/02.Orientacao_Objetos/9. Files/teoria/FileWriter_BufferedW/teste.txt";

        String[] lines = { "Título", "Primeira linha", "Subtítulo", "Mais uma linha" };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine(); // quebra linha
            }
            bw.newLine();
            bw.write("");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}