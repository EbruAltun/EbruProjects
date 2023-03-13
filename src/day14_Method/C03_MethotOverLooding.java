package day14_Method;

public class C03_MethotOverLooding {
    public static void main(String[] args) {

        String str=" Bu is olacak";
        System.out.println(str.replace("Bu is", "Java guzel"));
        System.out.println(str.replace('u','e'));
        System.out.println(str.replace('u', 'e')); // Be is olacak

        /*
            Bir class'da ayni isme sahip
            farkli islem yapan method'lar olabilir
            Java bu method'lardan hangisinin calisacagina
            parametrelere gore karar verir
            Bir class'da ismi ayni, parametreleri farkli method'lar olmasina
            Method OVERLOADING  denir.
         */

    }
}





