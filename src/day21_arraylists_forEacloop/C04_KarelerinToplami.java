package day21_arraylists_forEacloop;

public class C04_KarelerinToplami {
    public static void main(String[] args) {
        // Soru 2- Verilen int array’deki her elementin karelerini alip,
        //         karelerinin toplamini yazdiran bir method olusturun.

        int[] arr = {2, 3, 5,0,1};
        karelerToplaminiYazdir(arr);


    }
    public static void karelerToplaminiYazdir(int[] arr){
        int karelerToplami=0;

        for (int each:arr
             ) {
      karelerToplami+=each;
        }
        System.out.println(" verilen arraydeki elementlerin kareler toplamı : " +karelerToplami);
    }
}
