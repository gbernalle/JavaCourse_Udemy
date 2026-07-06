package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) throws Exception {
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2026-05-20");

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/YYYY").withZone(ZoneId.systemDefault());
        System.out.println(d02.format(fmt1));

        System.out.println(d03.atZone(ZoneId.systemDefault()));
    }
}
