package day21_arraylists_forEacloop;

import java.util.ArrayList;
import java.util.List;

public class C06_ {
    public static void main(String[] args) {
        // Soru 5- Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri
        // ayri bir liste olarak veren bir program yazin.

        Integer [] arr1= {3,2,5,6,7,8};
        Integer [] arr2= {3,9,8,5,6,1,};

        List<Integer>ortakElementlerListesi= new ArrayList<>();

        for (Integer each1:arr1) {
            for (Integer each2:arr2) {
           if(each1==each2 && !ortakElementlerListesi.contains(each1)){
               ortakElementlerListesi.add(each1);
           }
            }
        }
        System.out.println(ortakElementlerListesi);    // [3, 5, 6, 8]
    }
}
