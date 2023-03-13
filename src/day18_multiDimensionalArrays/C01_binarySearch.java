package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C01_binarySearch {

    public static void main(String[] args) {

        // verilen br array da istenen bir eleman olup olamdığını bul

        int [] arr= {4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr, 5)); // -2

        System.out.println(Arrays.binarySearch(arr,11)); // 4
        System.out.println(Arrays.binarySearch(arr,1)); // -1
        System.out.println(Arrays.binarySearch(arr,7)); // -2

        // Array de binary search () nun düzgün çalışması için
        // öncelikle sort () calışmalıdır
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 5)); // 4

        System.out.println(Arrays.binarySearch(arr,11)); // 8
        System.out.println(Arrays.binarySearch(arr,1)); // 0
        System.out.println(Arrays.binarySearch(arr,7)); // 6

        // indexs numrasıını buldu

        // binary search metofu aranan elementin inddeksini döner
        System.out.println(Arrays.binarySearch(arr, 2)); // -2

        System.out.println(Arrays.binarySearch(arr,8)); // -8
        System.out.println(Arrays.binarySearch(arr,10)); // -9
        System.out.println(Arrays.binarySearch(arr,13)); // -10

        // olmayan bir element aratılırsa önce array de olsadydı nerede olurdu bunnu buluyoruz
        // sonra olması gereken sıranın - işaretli değerini veriyoruz
        // bu mantıkla en küçüük elemnetden daha küçük bütün sayılar için -1
        // en büyük elementten büyük olan bütün sayılaar için de length degeri döndürür



    }
}
