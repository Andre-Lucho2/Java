package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Reservation {
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public Integer duration() {
        return (int) ChronoUnit.DAYS.between(checkIn, checkOut);
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

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return String.format(
                "Reservation: Room %d, check-in: "
                        + checkIn.format(fmt)
                        + ", check-out: " + checkOut.format(fmt)
                        + ", %d nights",
                roomNumber, duration());
    }

}
