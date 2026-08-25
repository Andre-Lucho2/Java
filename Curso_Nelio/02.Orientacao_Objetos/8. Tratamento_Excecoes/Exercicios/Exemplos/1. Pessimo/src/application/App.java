package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

import model.entities.Reservation;

public class App {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number:");
        int number = sc.nextInt();
        sc.nextLine();

        LocalDate[] dates = enterData();
        LocalDate checkIn = dates[0];
        LocalDate checkOut = dates[1];

        if (!checkOut.isAfter(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation r1 = new Reservation(number, checkIn, checkOut);
            System.out.println(r1);

            System.out.println();
            System.out.print("Enter data to update reservation: ");
            LocalDate[] updateDates = enterData();
            LocalDate checkIn2 = updateDates[0];
            LocalDate checkOut2 = updateDates[1];

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

    public static LocalDate[] enterData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Check-in date (dd mm yyyy):");
        String[] vect = sc.nextLine().split(" ");
        int day = Integer.parseInt(vect[0]);
        int month = Integer.parseInt(vect[1]);
        int year = Integer.parseInt(vect[2]);
        LocalDate checkIn = LocalDate.of(year, month, day);
        System.out.print("Enter Check-out date (dd mm yyyy):");
        vect = sc.nextLine().split(" ");
        day = Integer.parseInt(vect[0]);
        month = Integer.parseInt(vect[1]);
        year = Integer.parseInt(vect[2]);
        LocalDate checkOut = LocalDate.of(year, month, day);

        LocalDate[] dates = { checkIn, checkOut };

        sc.close();
        return dates;
    }

}