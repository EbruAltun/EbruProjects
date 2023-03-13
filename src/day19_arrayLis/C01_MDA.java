package day19_arrayLis;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {
        ////Soru 2- Verilen 2 katli bir array'de
        ////        ayni index'e sahip elementleri toplayip,
        ////        yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.
        //// input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //// output:                       [5, 7, 11]

        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        // ortak index kullanabilmek için en kısa olanı bulmalıyız

        int enKisaArrayLength= arr[0].length; //

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length<enKisaArrayLength){
                enKisaArrayLength= arr[i].length;

            }

        }
        // toplamları koymak için yeni bir array oluştur

        int[] toplamlarArray= new  int [enKisaArrayLength];
         int indeksdekiElementlerToplamı =0 ;

        for (int i = 0; i < toplamlarArray.length; i++) {

            for (int j=0; j<arr.length;j++ ){

                indeksdekiElementlerToplamı+=arr[j][i];
            }
        toplamlarArray[i]=indeksdekiElementlerToplamı;
            indeksdekiElementlerToplamı=0;

        }
        System.out.println(Arrays.toString(toplamlarArray));




    }

}
