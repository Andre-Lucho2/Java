package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.IPhone;
import model.entities.Product;
import model.services.CalculationService;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> listCSV = new ArrayList<>();
        List<IPhone> listIphone = new ArrayList<>();

        String path = "/mnt/65c22663-2276-4491-a595-2fb49f6b1e8c/Programacao/Aulas-teoricas/Java/Curso_Nelio/02.Orientacao_Objetos/11.Generics-Set-Map/03.Genericos_delimitados/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                listCSV.add(new Product(fields[0], Double.parseDouble(fields[1])));
                listIphone.add(new IPhone(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(listCSV);
            IPhone i = CalculationService.max(listIphone);

            // System.out.println("Most expensive: " + x);
            System.out.println(i);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}