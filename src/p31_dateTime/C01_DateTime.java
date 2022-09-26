package p31_dateTime;

import java.time.LocalDate;

public class C01_DateTime {
    public static void main(String[] args) {
        // Java'da sadece tarih kullanmak istiyorsak
        // LocalDate Class'indan bir obje uretiriz

        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.plusWeeks(20));
        System.out.println(tarih.plusDays(500));
        System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12));

        System.out.println(tarih.minusMonths(15));
        System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10));

        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.getDayOfWeek());
        LocalDate dogumGunu= LocalDate.of(1999, 12, 27);
        System.out.println(dogumGunu.getDayOfWeek());

        System.out.println(tarih.getMonth());



        System.out.println(tarih.isLeapYear()); // false

        // Eger suan ki tarih ile degil de eski bir tarih ile islem yapacaksak
        // LocalDate.of() methodunu kullaniyoruz
        LocalDate tarih1 = LocalDate.of(1995, 12, 15);
        LocalDate tarih2 = LocalDate.of(1995, 12, 10);

        System.out.println(tarih1.isAfter(tarih2)); // true
        System.out.println(tarih1.isBefore(tarih2)); // false



    }
    }

