package day38_exceptions_garbageCollector;

import java.util.Arrays;

public class C03_Iterator {
    public static void main(String[] args) {

        int[] arr = {3, 8, 1, 9, 15};

        // tum elementleri yazdirin
        // for-each

        for (int each : arr
        ) {
            System.out.print(each + "    "); // 3    8    1    9    15
        }

        System.out.println("");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "    ");
        }
    }}