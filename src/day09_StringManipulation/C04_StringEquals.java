package day09_StringManipulation;

public class C04_StringEquals {
    public static void main(String[] args) {
     String str1= "Java";
     String str2= "JAVA";
     String str3= "java";
     String str4="JaVa";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str3.equals(str4)); // false

        // eger büyü küçük harfe dikkat etmeden yazdırmak istersek

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        String str5= "java";
        String str6="ja";
        String str7= "va";
        String str8=str6.concat(str7);
        System.out.println(str8); // java

        System.out.println(str1==str5); // false
        System.out.println(str1==str8); // java== java false

         /*
            == ile Stringleri karsilastirirsak hem metin degerine hem de referanslarina bakar
            equals ile Stringleri karsilastirirsak sadece metin degerlerine bakar

            == ile Stringleri karsilastirdigimizda bekledigimizden farkli sonuclar alabilir,
            bu yuzden iki String'i karsilastiracaksak == degil equals kullaniriz
         */

    }
}
