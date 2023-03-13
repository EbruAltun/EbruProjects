package day09_SwitchManipulation;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("ay no giriniz");
        int ayNo = scan.nextInt();
        switch (ayNo) {
            case 1:
                System.out.println("kıs");
                break;
            case 2:
                System.out.println("kıs");
                break;
            case 3:
                System.out.println("kıs");
                break;
            case 4:
                System.out.println("ilkbahar");
                break;
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
            case 12:
                System.out.println("kıs");
            default:
                System.out.println(" ay no yanlıs girildi");
        }
    }
}