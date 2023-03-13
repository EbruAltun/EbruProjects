package day24_staticKeyword;

import java.util.Arrays;

public class C03_PassByValue {
    public static void main(String[] args) {
        int [] arr= {3,4,5};
        elementleriArttır(arr,4);         // methot da array: [7, 8, 9]

        System.out.println("methot call dan sonra arr: "+Arrays.toString(arr));  // methot call dan sonra arr: [7, 8, 9]

    }

    public static void elementleriArttır(int[] arr,int artısmiktarı) {
        for (int i = 0; i < arr.length; i++) {

            arr[i]+=artısmiktarı;

        }
        System.out.println("methot da array: " + Arrays.toString(arr));

    }
}
