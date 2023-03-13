package day05_incrementDecrement_Concatenation;

public class C01_InrementDecrement {
    public static void main(String[] args) {
         int a=20;
         // a nın değerini 3 artr ve yeni değerini oluştracagın b varıable ne ata

      //  a= a+3;
           a+=3;

        //a++;
        //a++;
        //a++;

        int b=a;
        System.out.println("a :"+a+ ","+b); //23 23

        a=20;

        // a nın değerini b ye ata, sonra a nın değeriini 3 artır
        b=a;
        a+= 3;
        System.out.println("a :"+a+ ","+b); // 23 20

        System.out.println("=========");
        a=20;

        // a nın değerini yazdır, ve sonra a yı 5 artır

        System.out.println("a :"+a);

         a+=5;
       // burada a yazdırsak

        System.out.println("=========");
         a=20;
         // anın değerini 2 azalt ve yazdır

        a-=2;
        System.out.println("a :"+a); // 18








    }
}
