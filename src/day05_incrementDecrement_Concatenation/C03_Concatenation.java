package day05_incrementDecrement_Concatenation;

public class C03_Concatenation {
    public static void main(String[] args) {

        // bir strıg başka bir string veya başka data turunden bir variable ile
        // + işareti ile birleşir

        String a = "Java";
        String b = "Güzeldir";

        System.out.println(a + b);       // javagüzeldir
        System.out.println(a + " " + b); //java güzeldir

        int c = 10;
        int d = 20;
        System.out.println(a + c + d);   // java1020

        // string  başka data türündeki veriyle toplanırsa sonucu string yapar

        // java30 yazmak için;

        System.out.println(a + (c + d)); // java30
        System.out.println(a + c * d); //java200
        System.out.println(d + c + a); //30java

    }
}
