package day04_DataCastingWrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        /*
        // non-primitive data turlerinin hazir method'lari varken
        // primitive data turlerinin hazir method'lari yoktur
        // Java primitive data turleri icin, kolayca gecis yapabilecekleri
        // non-primitive data turleri olusturmustur

           int ==> Integer
           char ==> Character
           byte ==> Byte
           boolean ==> Boolean
         */
        Integer sayı =10;
        // int variable'a atadigimiz degerleri atayabiliyoruz
        // arti olarak hazir method'lari var
        // variable olusturmadan da bazi method'lari kullanabiliyoruz

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647

        String STr= "345";
        System.out.println(STr+10); //34510

        // bu değre 10 ekle
         int par= Integer.parseInt(STr);
        System.out.println(par+10); //355

        par=Integer.valueOf(STr);
        System.out.println(par+10); //355

        char krk='3';
        System.out.println(Character.isDigit(krk)); //true
        System.out.println(Character.isLetter(krk)); // false

    }
}
