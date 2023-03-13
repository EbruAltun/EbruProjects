package day27_StringBuilder;

public class C03_equals_compare {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java");
        StringBuilder sb2= new StringBuilder("Java");
        String str= "Java";

         // System.out.println(sb1== str);
        // Java da farklı data türüne sahip non- pirimitive objeler == karşılaştırılamaz

        System.out.println(sb1==sb2); // false
        System.out.println(sb1==sb1); // true  (==) sadece kendisine eşit olunca true olur

        System.out.println(sb1.equals(sb2)); // false


        /* StringBuilder  da içerik aynı olsa bile equals methodu false döner
          çünkü StringBuilder Classında equals methodu yoktur
          equals methodu unu parent class i olan Object Classs ından kullanır
          ve bundan dolayı  içeriklere bakmadan false verir
          */

        System.out.println(sb1.equals(str)); // false
        System.out.println(sb1.equals(sb1));  // true

        // iki StringBuilder in içeriklerinin aynı olduğunu kontrol etmek için
        // compareTo() kullanılır
        System.out.println(sb1.compareTo(sb2)); // 0
         // System.out.println(sb1.compareTo(str)); CTE

        StringBuilder sb3= new StringBuilder("Hava");
        StringBuilder sb4 =new StringBuilder("Tava");

        System.out.println(sb1.compareTo(sb3)); //   2
        System.out.println(sb1.compareTo(sb4));  // - 10
        System.out.println(sb3.compareTo(sb4)); // - 12



    }
}
