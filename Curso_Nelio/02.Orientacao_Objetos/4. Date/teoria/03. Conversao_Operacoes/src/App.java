import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 
         * A. Conversões
         * -----------------
         */

        LocalDate date01 = LocalDate.parse("2026-08-07");
        LocalDateTime date02 = LocalDateTime.parse("2025-07-20T18:00:10");
        Instant date03 = Instant.parse("2025-07-20T02:00:00Z");

        // for (String zonas : ZoneId.getAvailableZoneIds()) {
        // System.out.println(zonas);
        // };

        LocalDate return01 = LocalDate.ofInstant(date03, ZoneId.systemDefault());
        LocalDate return02 = LocalDate.ofInstant(date03, ZoneId.of("Europe/Istanbul"));
        LocalDateTime return03 = LocalDateTime.ofInstant(date03, ZoneId.systemDefault());
        LocalDateTime return04 = LocalDateTime.ofInstant(date03, ZoneId.of("Europe/Istanbul"));

        // System.out.println(return01);
        // System.out.println(return02);
        // System.out.println(return03);
        // System.out.println(return04);

        // System.out.println(date01.getDayOfMonth());
        // System.out.println(date01.getMonthValue());
        // System.out.println(date02.getHour());

        /*
         * 
         * B. Operações
         * -----------------
         */

        LocalDate date04 = LocalDate.parse("2026-10-10");
        LocalDateTime date05 = LocalDateTime.parse("2026-10-10T18:00:10");
        Instant date06 = Instant.parse("2024-07-20T02:00:00Z");

        LocalDate pastWeek = date04.minusDays(7);
        LocalDate nextMonth = date04.plusMonths(2);
        LocalDateTime overdueHours = date05.minusHours(3);
        LocalDateTime minutesAhead = date05.plusMinutes(25);

        // Para Instant:
        Instant pastWeekInstant = date06.minus(7, ChronoUnit.DAYS);
        Instant minutesAheadInstant = date06.plus(5, ChronoUnit.HOURS);

        // System.out.println(pastWeek);
        // System.out.println(nextWeek);
        // System.out.println(overdueHours);
        // System.out.println(minutesAhead);

        // System.out.println(pastWeekInstant);
        // System.out.println(minutesAheadInstant);

        /*
         *
         * B.1 Diferença entre períodos:
         * ------------------------------------
         */

        Period t1 = Period.between(pastWeek, date04);
        // ou
        // Duration t01 = Duration.between(pastWeek.atStartOfDay(),
        // date04.atStartOfDay());

        Duration t2 = Duration.between(overdueHours, date05);
        Duration t3 = Duration.between(pastWeekInstant, date06);

        System.out.println(t1.getDays());
        // System.out.println(t01.toDays());

        System.out.println(t2.toHours());
        System.out.println(t3.toDays());

    }
}
