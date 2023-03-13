package day11_stringManipulations_Forlop;

public class C09_Forloop {
    public static void main(String[] args) {
        // 50 den başlayıp 100 ekadr olsan sayıları
        // yan yana aralaarında bir boşluk olarak yazıdrın

        for (int i = 50; i <=100 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");
        // 3 basamaklı sayılardan 23 ile bölünebilenleri
        // yan yana aralarındavir boşluk olraak yazdırın

        for (int i =100; i < 1000; i++) {
        if(i%23==0){
    System.out.println(i +" ");
}
        }

        System.out.println("");

        //20 den başlayıp" 7 şer artırıp 100 e kadar yazdırın
        // 100 yazdırmam gerekiosa yazdır ama 100 u gecme
        for (int i = 20; i <=100 ; i+=7) {
            System.out.print(i+" ");
        }
        System.out.println("");

        // 100 den başlayarak 1e kadar sınırlar dhi) 7 ile bölünebilen sayıları yazdır

        for (int i = 100; i >=1 ; i--) {
            if(i%7==0){
                System.out.print(i+" ");
            }
        }

    }

}
