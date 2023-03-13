package day14_Method;

public class C01_AsalSayı {
    public static void main(String[] args) {
        // Verilen 1'den buyuk bir tamsayi icin
        //asal sayıı olup  olmadığını yazdıran bir methot oluşturun

        System.out.println(isAsal(20)); // false
        System.out.println(isAsal(43)); // true

    }

    public static boolean isAsal(int sayi) {
        int flag = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;
                break;
            }
        }
        if (sayi == 2) {
            System.out.println("girilen 2 sayısı ASAL bir sayıdır");
        } else if (flag == 0) {
            System.out.println("girilen " + sayi + "sayısı ASaL bir saydır");
        } else {
            System.out.println("girilen " + sayi + "sayısı ASaL bir sayı değildir");
        }

        return false;
    }


}