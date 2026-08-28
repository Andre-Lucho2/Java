package application;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.entities.Reservation;
import model.exceptions.DomainException;

public class App {
    private static final SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Room Number:");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Check-in date (dd/mm/yyyy):");
            Date checkIn = fmt.parse(sc.next());
            System.out.print("Enter Check-out date (dd/mm/yyyy):");
            Date checkOut = fmt.parse(sc.next());

            Reservation r1 = new Reservation(number, checkIn, checkOut);
            System.out.println(r1);

            System.out.println();
            System.out.print("Enter data to update reservation: ");
            System.out.print("Enter Check-in date (dd/mm/yyyy):");
            checkIn = fmt.parse(sc.next());
            System.out.print("Enter Check-out date (dd/mm/yyyy):");
            checkOut = fmt.parse(sc.next());

            r1.updateDates(checkIn, checkOut);
            System.out.println(r1);

        } catch (ParseException e) {
            System.out.println("Invalid date format!");
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage()); // tratamento de exceção personalizada
        } catch (RuntimeException e) {
            System.out.println("Unexpected error"); // tratam. de exceção de Runtime
        }
        sc.close();
    }
}