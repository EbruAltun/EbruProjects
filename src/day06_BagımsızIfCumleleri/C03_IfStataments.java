package day06_BagımsızIfCumleleri;

import java.util.Scanner;

public class C03_IfStataments {
    public static void main(String[] args) {
       // soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen üçgenin 3 kenar uzunluğunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

         // java da 3 lü karşılaştırma yoktur
        // ikili karşılaştırma yapmalıyız && kullnırız

        if(kenar1 == kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("eskenar ucgen");
        }




    }
}
