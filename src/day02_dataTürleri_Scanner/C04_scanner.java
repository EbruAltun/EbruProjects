package day02_dataTürleri_Scanner;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {

        // 1. adım : scanner objesını oluşturun
        Scanner scan= new Scanner(System.in);

        // 2. adım: kullanıcıya ne istediğinizi söyleyin
        System.out.println("lütfen isminizi girin");

        //3. adım: girilen bilgiyi içine koyabileceğimiz bir variable oluşturun
        //        oluşturduğumuz scaner objesi ile uygun method u kullanarak bilgiyi alın

        String kullanıcıİsmi= scan.next();
        System.out.println("girilen isim :"+ kullanıcıİsmi);
    }
}
