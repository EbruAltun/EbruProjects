package day05_incrementDecrement_Concatenation;

public class C04_StringIntGecisler {
    public static void main(String[] args) {
        String s1="435";
        // s1 i int a cevir
        int a=Integer.parseInt(s1);
        System.out.println(a); // 435
        System.out.println(a++); // 435

        int c= 20;
        int b= 40;
        System.out.println(c+b); //   60
        System.out.println(c+""+b);  //    2040
        System.out.println(c+ " "+ b); // 20 40
        System.out.println(""+c+b); //    2040
        System.out.println(c+b+""); //     60

    }
}
