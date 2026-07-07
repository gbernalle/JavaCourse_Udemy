package application;

import entities.enums.OrderStatus;
import test.Order;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws Exception {
        Order order = new Order(1080, new Date(), OrderStatus.DELIVERED);
        System.out.println(order);
    
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    
    }
}
