import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate date01 = LocalDate.now();
        LocalDateTime date02 = LocalDateTime.now();

        // GTM-00 ou UTC-00
        Instant date03 = Instant.now();

        // Formato ISO 8601
        LocalDate date04 = LocalDate.parse("2025-07-20");
        LocalDateTime date05 = LocalDateTime.parse("2025-07-20T18:00:10");

        // Passando hora local (Com TimeZone) - print sai como GMT-00
        Instant date06 = Instant.parse("2025-07-20T18:00:10-03:00");

        // Retornando uma data(em ISO) passando uma data em formato personalizado:
        // Objeto DateTimeFormatter
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate date07 = LocalDate.parse("20/07/2025", fmt01);
        LocalDateTime date08 = LocalDateTime.parse("20/07/2025 22:20", fmt02);

        LocalDate date09 = LocalDate.of(2026, 8, 07);
        LocalDateTime date10 = LocalDateTime.of(2026, 8, 07, 9, 31, 33, 10001);

        // System.out.println(date01);
        // System.out.println(date02);
        // System.out.println(date03);
        // System.out.println(date04);
        // System.out.println(date05);
        // System.out.println(date06);
        // System.out.println(date07);
        System.out.println(date08);
        // System.out.println(date09);
        // System.out.println(date10);

    }
}

// OBS.: os métodos .toString() das datas em Java já transformam a data em
// formato ISO 8601

// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html