package application;

import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String folderPath = "/mnt/65c22663-2276-4491-a595-2fb49f6b1e8c/Programacao/Aulas-teoricas/Java/Curso_Nelio/02.Orientacao_Objetos/9. Files/teoria/Manipulando_pastas";

        String filesPath = "/mnt/65c22663-2276-4491-a595-2fb49f6b1e8c/Programacao/Aulas-teoricas/Java/Curso_Nelio/02.Orientacao_Objetos/9. Files";

        // File --> caminho de arquivo(s), caminho de pasta(s)
        File folders = new File(folderPath);
        File files = new File(filesPath);

        File[] foldersList = folders.listFiles(File::isDirectory);
        File[] filesList = files.listFiles(File::isFile);

        System.out.println("FOLDERS:");
        for (File folder : foldersList) {
            System.out.println(folder);
        }

        System.out.println("FILES:");
        for (File file : filesList) {
            System.out.println(file);
        }

        try {
            File newFile = new File(filesPath, "a.txt");
            File newFile2 = new File("a.txt");
            newFile.createNewFile();
            newFile2.createNewFile(); // retorna true

            // System.out.println("Directory created successfully: " + success);
        } catch (Exception e) {
            // TODO: handle exception
        }

        sc.close();
    }
}