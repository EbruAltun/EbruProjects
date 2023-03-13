package day21_arraylists_forEacloop;

public class C02_forEachloop {
    public static void main(String[] args) {
        /*
        bizden istenen görevler sıralama önemsiz ise
        asıl amaçlanan tüm elemetleri elden geçirmek ise
        for Loop yerine for each loop tercih edilir.

            for each loop da
            - index yok
            - başlangıc değeri yok
            - bitiş değeri yok

         */

       int [] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

       // arr ın tum elementlerinin toplamını yazdır

        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;
        }
        System.out.println("Elementlerin Toplamı : "+toplam);

        //  arrın elementlerinden 3 ile bölünebilenleri yazdırın

        for (int each:arr
             ) {
            if(each%3==0) System.out.print(each+ " ");
        }

        System.out.println("");

       // arr ın elementleri içinde kaç tane tek sayı olduğunu
        int sayac=0;
        for (int each:arr
             ) {
            if(each%2!=0) sayac++;
        }
        System.out.println("Arraydeki tek sayı adedi : "+sayac);
    }
}
