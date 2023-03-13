package day19_arrayLis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekraralaradanKurtulma {
    public static void main(String[] args) {
        // verilen bir array dan tekrar eden sayıları silip
        // her bir elementin sadece bir kez kullanılldığı bir hale dönüştürün

        int [] arr= {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        // bir tane boş list oluştur
        // array deki her bir elemanı ele al
        // ele aldığın element list de yoksa ekle varsa ekleme
        // böylece benzersiz elementlerden oluşan list oluştur

        List benzersizElementlerList= new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!benzersizElementlerList.contains(arr[i])){
              benzersizElementlerList.add(arr[i]);

        }
        }
        System.out.println(benzersizElementlerList); //[3, 4, 5, 6, 2, 7]


        // istenen list eyı elde ettk
        // bunu arr ye direk atayamayız

        arr=new int[benzersizElementlerList.size()];   //[0,0,0,0,0,]
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) benzersizElementlerList.get(i);

        }

        System.out.println(Arrays.toString(arr));
    }
}
