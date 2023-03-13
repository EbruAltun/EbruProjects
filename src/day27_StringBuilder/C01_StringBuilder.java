package day27_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder();

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); //   0

        sb1.append("mustafa"); // append eleman eklem

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length());  // 7

        sb1.append("yılmaztürk");
        System.out.println(sb1);   // mustafayılmaztürk 17 karakter
        System.out.println(sb1.capacity()); // 34= 2* eski capacity +2
        System.out.println(sb1.length());  // 17

        sb1.append("javayı cok sever, sabah akşam java çalışır");
        System.out.println(sb1.length()); // 59
        System.out.println(sb1.capacity()); // 70= 2* 34 +2
        System.out.println(sb1.length());  // 59


        // 2.  yöntem

        StringBuilder sb2= new StringBuilder("java candir");
        System.out.println(sb2.capacity()); // 27
        System.out.println(sb2.length());  // 11

        // 3. yöntem
        StringBuilder sb3= new StringBuilder(11);
        sb3.append("43258978912");
        System.out.println(sb3);         //   43258978912
        System.out.println(sb3.capacity());  // 11
        System.out.println(sb3.length());   // 11

        sb3.append(" tc no");
        System.out.println(sb3);  //  43258978912 tc no
        System.out.println(sb3.capacity());  // 11 *2+2 = 24
        System.out.println(sb3.length()); // 17

        String str= "java candir";

       // trim :

        sb3.trimToSize();
        System.out.println(sb3.capacity());  // 17
        System.out.println(sb3.length()); // 17







    }
}
