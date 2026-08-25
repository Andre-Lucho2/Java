import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

public class App {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE;

        LocalDate date = LocalDate.now();
        LocalDate date01 = LocalDate.parse("2026-08-07");
        LocalDateTime date02 = LocalDateTime.parse("2025-07-20T18:00:10");
        Instant date03 = Instant.parse("2025-07-20T02:00:00Z");
        ZonedDateTime newTime = ZonedDateTime.now();

        // Formatando uma data passada em ISO
        // ------------------------------------
        // System.out.println(date01.format(fmt1));
        // System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        // System.out.println(date01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // // ou
        // System.out.println(fmt1.format(date01));

        // System.out.println(date02.format(fmt2));

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        // System.out.println(fmt3.format(date03));
        // obs1:
        // Como estamos formatando o Objeto Instant - Data Global, devo ter uma TimeZone
        // --> método .withZone();
        // ZoneId.systemDefault() --> hora do sistema
        // obs2: Instant não tem metodo .format --> chamá-lo atraves do fmt3

        // System.out.println(date02.format(fmt4));
        // System.out.println(fmt5.format(date03));

        System.out.println(date01.format(fmt1));

    }
}
