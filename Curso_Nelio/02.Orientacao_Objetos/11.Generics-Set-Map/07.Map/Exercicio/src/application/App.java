package application;

import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
        String path = "/mnt/65c22663-2276-4491-a595-2fb49f6b1e8c/Programacao/Aulas-teoricas/Java/Curso_Nelio/02.Orientacao_Objetos/11.Generics-Set-Map/8.Map/Exercicio/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> mapList = new HashMap<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                String key = fields[0];
                int value = Integer.parseInt(fields[1]);

                if (mapList.containsKey(key)) {
                    int sum = value + (mapList.get(key));
                    mapList.put(key, sum);
                } else {
                    mapList.put(key, value);
                }
                line = br.readLine();
            }

            // for (String candidate : mapList.keySet()) {
            // System.out.println(candidate + ": " + mapList.get(candidate));
            // }

            // ou

            for (Map.Entry<String, Integer> entry : mapList.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            /*
             * Map.Entry<> --> empacota cada par chave/valor em uma única entrada
             * entrySet() --> devolve uma lista Set com o Par (não apenas a chave):
             * Set(Map.Entry(String, Integer), Map.Entry(String, Integer), ....)
             * 
             * Mto mais performático --> não precisa percorrer o conjuto todo novamente a
             * cada 'mapList.get(candidate)'
             */

            // ou
            // Lamba forEach:
            // mapList.forEach((name, votes) -> System.out.println(name + ": " + votes));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

// List<Integer> values = new ArrayList<>();
// values.addAll(mapList.values()); --> percorre uma lista e acrescenta cada
// elem a uma nova lista-
// é o mesmo que:
// for (Integer value : mapList.values()) {
// voteList.add(value);
// }
