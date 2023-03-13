package day25_PassByValue_ImmutableClasess;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {

        List<Integer> sayılar= new ArrayList<>();
         sayılar.add(3);
         sayılar.add(5);
         sayılar.add(4);
        System.out.println(sayılar);  // [3, 5, 4]

        elementleriArtır(sayılar);
        // elementleriArtır methodunu çalıştırdıktan sonra
        System.out.println("Element artır methodundan sonra : "+sayılar);

        yeniListAta(sayılar);
        System.out.println("yeniliste methodundan sonra : "+sayılar);


    }
    public  static  void elementleriArtır(List<Integer>sayılar){
     // tüm elementleri 2 katına çıkaralım

        for (int i = 0; i < sayılar.size(); i++) {
            sayılar.set(i, 2*sayılar.get(i));

        }
        System.out.println("elementleri artır methodunda : "+ sayılar);

    }
    public static void yeniListAta(List<Integer>sayılar){
        // sayılar listesine yeni bir list atayıp ,
        // sonra 1 2 3 elementlerini ekle

        sayılar= new ArrayList<>();
        sayılar.add(1);
        sayılar.add(2);
        sayılar.add(3);
        System.out.println("yeniListAta methodunda : "+sayılar);

    }
}
