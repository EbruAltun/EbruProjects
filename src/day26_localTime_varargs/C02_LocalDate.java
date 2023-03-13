package day26_localTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C02_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);  // 2023-03-10

        System.out.println(tarih.isLeapYear()); // false artık yıl değil
        LocalDate tarih2 = LocalDate.of(2220, 10, 10);
        System.out.println(tarih2.isLeapYear());  //true

        System.out.println(tarih.plusWeeks(20).plusDays(3)); // 2223-07-31

        System.out.println(tarih.minusDays(3).minusMonths(3)); // 2022-12-07

        System.out.println(tarih.withYear(1923).withMonth(5)); // 1923-05-09

        System.out.println(tarih.getDayOfYear()); // 68

        System.out.println(tarih.getMonth());     // MARCH
        System.out.println(tarih.getMonthValue()); // 3

        LocalDate tarih3 = LocalDate.of(1980, 1, 1);
        System.out.println(tarih3.getDayOfWeek()); // TUESDAY


        System.out.println(tarih.isBefore(tarih3)); // false

        System.out.println(tarih.isAfter(tarih3)); // true


    }
}
