package day12_forLoops;

public class C05_fakToriyel2 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        int sayı = 6;
        int faktOriyel = 1;
        System.out.println("sayı+!= ");

        for (int i = sayı; i >= 1; i--) {
            faktOriyel *= i;
            if (i != 1) {
                System.out.println(i + " * ");
            } else {
                System.out.println(i + " ");
            }

            System.out.println("=" + faktOriyel);
        }
    }}
