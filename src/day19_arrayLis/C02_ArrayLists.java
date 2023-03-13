package day19_arrayLis;

import day17_arrays.C06_ArrayeElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayLists {
    public static void main(String[] args) {
         /*
             Arraylist, uzunluğu esnek bir listedir
             Array altyapısını kullanır, ancak ekleme ve silme gibi işlemlerde daha avantajlıdır

             Arraylist in tek avantajı var
             o da elementleri tek tek eklemek gerekmesi
          */
        int[] arr={3,4};
        arr= C06_ArrayeElemanEklemeMethodu.arrayeElementEkle(arr,5);

        System.out.println(Arrays.toString(arr)); // [3, 4, 5]

        arr= C06_ArrayeElemanEklemeMethodu.arrayeElementEkle(arr,10);

        System.out.println(Arrays.toString(arr));  //[3, 4, 5, 10]

        List<String> harfler= new ArrayList<>();
        harfler.add("s");
        harfler.add("s");
        harfler.add("a");

        System.out.println(harfler); //[s, s, a]




}
}
