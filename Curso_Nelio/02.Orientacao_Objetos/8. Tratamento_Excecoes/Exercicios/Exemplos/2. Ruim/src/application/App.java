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

            // Update reservation

            System.out.println();
            System.out.print("Enter data to update reservation: ");
            LocalDate[] updateDates = r1.enterData();
            LocalDate checkIn2 = updateDates[0];
            LocalDate checkOut2 = updateDates[1];

            // retorno de .updateDates() validado + confirmação:

            String error = r1.updateDates(checkIn2, checkOut2);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println(r1);
            }

        }
        sc.close();
    }

}