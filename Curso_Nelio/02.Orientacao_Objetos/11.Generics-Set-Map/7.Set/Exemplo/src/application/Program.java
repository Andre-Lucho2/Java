package application;

import java.util.Set;
import java.util.Date;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;

import model.entities.LogEntry;

public class Program {

    public static void main(String[] args) {
        String path = "/mnt/65c22663-2276-4491-a595-2fb49f6b1e8c/Programacao/Aulas-teoricas/Java/Curso_Nelio/02.Orientacao_Objetos/11.Generics-Set-Map/7.Set/Exemplo/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");

                set.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));

                line = br.readLine();
            }
            System.out.println("Total username: " + set.size());

            for (LogEntry logEntry : set) {
                System.out.println(logEntry.getUsername());
                System.out.println(logEntry.getMoment());
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
