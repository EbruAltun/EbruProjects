package day05_incrementDecrement_Concatenation;

public class C02_PreIncrement_Postıncrement {
    public static void main(String[] args) {
        /*
            Eger sayinin degeri SADECE 1 artacak veya azalacaksa
            artirip sonra yazdirma/atama
            yazdirip sonra artirma/atama
            islemlerini tek satirda yapabiliriz
         */

        // a nın değerni 1 artır, yeni oluşturacağın b variablene ata

        int a=20;
       /* a++;
        int b=a;
        */

        int b= ++a; // öncde artır, sonra ata

       // a++;
       // int b= a;
        System.out.println("a:"+a+", b :" +b); // 21 21

      // a nın değerini b ye ata, snra a yı 1 artır
        a=20;
        b=a++; // once ata, sonra artır

        /*b=a;
        a++;
       */
        System.out.println("a:"+a+", b :" +b); // 21 20

        // a değerini 1 azalt, sonra a yı yazdr

        a=20;
        System.out.println(--a); // 19
        System.out.println(" bir sonraki satırda a:"+ a); // 19





    }
}
