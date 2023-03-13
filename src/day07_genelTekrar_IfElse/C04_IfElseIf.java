package day07_genelTekrar_IfElse;

import java.util.Scanner;

public class C04_IfElseIf {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("sayı gir");

        int sayı= scan.nextInt();

        if(sayı%3==0 &&sayı%5==0){
            System.out.println("3 ve 5 in katı");
        }else if(sayı%3==0){
            System.out.println("3 un katı");
        } else if (sayı%5==0) {
            System.out.println("5 in katı");
        }
    }

    public static class C03_IfElseIf {
        public static void main(String[] args) {

            // kullanıcdan pozitif bir tam sayı alın
            // sayı 3 ile bölünebiliyosa 3 un katı
            //sayı 5 ile bölünebiliyosa 5 un katı
            // sayı hem 5 hemde- 3 ile bölünebiliyosa
            // ikisinede bölünemiyosa hem 3 un katı hem de 5 in katı değil

            Scanner scan = new Scanner(System.in);
            System.out.println("lütfen poztif tamsayı giriniz");
             int sayı= scan.nextInt();

             if(sayı%3==0&& sayı%5==0){
                 System.out.println("3 ve 5 in katı katı");
             }else if(sayı%5==0){
                 System.out.println("5 in katı");
             }else if (sayı%3==0 ) {
                 System.out.println("3 un katı");
             }else {
                 System.out.println("3 ün ve 5 in katı değil");
             }
        }
    }
}
                      /* bazen şartlar olası tüm durumları karşılamaz
                      bu durumda ıfelee  if cümlleriri else ile bitmez
                     else ile bitmeyen if else cümlelrinde baı durumlarda hiçbir
                     if badysi devreye girmeyebilir


                      eger bir if else if... cümleis else ile bitiyorsa
                      mutlaka ıf badylerınden 1 TANESİ çalışır
                     */