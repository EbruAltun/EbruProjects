package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop_RakamlarToplamiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int rakamlarToplami = 0;
        int birlerBasamgi;
        System.out.println("sayi giriniz");
        int n = scanner.nextInt();
        scanner.nextLine();
        while (flag){
            birlerBasamgi =  n%10;
            rakamlarToplami+=birlerBasamgi;
            n = n/10;
            if (n==0){
                flag=false;
            }
        }
        System.out.println("Girilen sayi'nin rakamlar toplami: "+rakamlarToplami);
    }
    }

