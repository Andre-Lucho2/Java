package application;

import java.util.Date;
import entities.Order;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
        // OrderStatus.PENDING_PAYMENT --> Java tranforma os atributos da enum em string(exatamente conforme declarado)


        // Tipo String -> enum
        OrderStatus osToString = OrderStatus.valueOf("DELIVERED"); 
        // .valueOf() deve receber a String exatamente como declarado no Tipo enum

        System.out.println(osToString);
    }
}
