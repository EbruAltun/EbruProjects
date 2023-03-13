package day02_dataTürleri_Scanner;

import java.net.Inet4Address;
import java.util.Scanner;

public class C05_ScannerilkGörev {
    public static void main(String[] args) {
        // kullnıcdan bir sayı alın
        // ve sayınınn karesini yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");

        double girilenSayı= scan.nextDouble();
        System.out.println( "girilen sayının karesi :"+ girilenSayı*girilenSayı);
    }
}
