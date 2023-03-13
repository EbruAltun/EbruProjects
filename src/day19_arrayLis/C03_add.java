package day19_arrayLis;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C03_add {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        System.out.println(sayilar); //[3, 5, 2]

        // 3 ile 5 arasına element olarak 8 ekle
        sayilar.add(1,8);
        System.out.println(sayilar); //  [3, 8, 5, 2]

        List<Integer>ekler=new ArrayList<>();
        ekler.add(5);
        ekler.add(6);
        System.out.println(ekler);  // [5, 6]
         sayilar.addAll(ekler);
        System.out.println(sayilar); // [3, 8, 5, 2, 5, 6]

    //   8 il 5 arasoma  ekler i ekle

        sayilar.addAll(2,ekler);
        System.out.println(sayilar);  // [3, 8, 5, 6, 5, 2, 5, 6]


    }
}
