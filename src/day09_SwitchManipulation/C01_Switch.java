package day09_SwitchManipulation;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {
        //   // Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("ay no giriniz");
        int ayNo= scan.nextInt();
        switch (ayNo){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("SUBAT");
                break;
            case 3:
                System.out.println("MART");
                break;
            case 4:
                System.out.println("NISAN");
                break;
            case 5:
                System.out.println("MAYIS");
                break;
            case 6:
                System.out.println("HAZIRAN");
                break;
            case 7:
                System.out.println("TEMMUZ");
                break;
            case 8:
                System.out.println("AGUSTOS");
                break;
            case 9:
                System.out.println("EYLL");
                break;
            case 10:
                System.out.println("EKM");
                break;
            case 11:
                System.out.println("KASM");
                break;
            case 12:
                System.out.println("ARALIK");
            default:
                System.out.println(" ay no yanlıs girildi");
        }
    }
}
