package day12_forLoops;

public class C04_FaktöriYel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.

        int sayı=5;
        int fakToriyel=1;

        for (int i = sayı; i >=1 ; i--) {
            fakToriyel*=i;

        }
        System.out.println(sayı+"!="+fakToriyel);
    }
}
