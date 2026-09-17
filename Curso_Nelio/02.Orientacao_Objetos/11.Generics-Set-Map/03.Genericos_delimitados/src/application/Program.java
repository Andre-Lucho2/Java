package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.CalculationService;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "/mnt/65c22663-2276-4491-a595-2fb49f6b1e8c/Programacao/Aulas-teoricas/Java/Curso_Nelio/02.Orientacao_Objetos/11.Generics-Set-Map/03.Genericos_delimitados/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Double value = Double.parseDouble(fields[1]);

                list.add(new Product(name, value));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive: " + x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}