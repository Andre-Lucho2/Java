package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

import model.entities.Reservation;

public class App {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        Reservation r1 = new Reservation();

        // Reservation

        System.out.print("Enter Room Number:");
        int number = sc.nextInt();
        sc.nextLine();

        LocalDate[] dates = r1.enterData();
        LocalDate checkIn = dates[0];
        LocalDate checkOut = dates[1];

        if (!checkOut.isAfter(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            r1 = new Reservation(number, checkIn, checkOut);
            System.out.println(r1);

        // Update Reservation

            System.out.println();
            System.out.print("Enter data to update reservation: ");
            LocalDate[] updateDates = r1.enterData();
            LocalDate checkIn2 = updateDates[0];
            LocalDate checkOut2 = updateDates[1];

            // Lógica de validação de .updateDates():

            LocalDate now = LocalDate.now();
            if (checkIn2.isBefore(now) || checkOut2.isBefore(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (!checkOut2.isAfter(checkIn2)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } else {
                r1.updateDates(checkIn2, checkOut2);
                System.out.println(r1);
            }
        }
        sc.close();

    }
}