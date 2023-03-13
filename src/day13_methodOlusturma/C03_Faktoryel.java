package day13_methodOlusturma;

public class C03_Faktoryel {
    public static void main(String[] args) {
        // verdiğimiz bir sayının faktöryelini hesaplayıp
        // sonucu bize döndüren bir metod olusturun

        /*
             Method Oluşturma Aşamaları
            1- public static standart (şimdilik)
            2- oluşturduğumuz method bize bir sonuç döndürecekse
               döndüreceği sonucun data türünü yaz
            3- method ismi
            4- method parantezi() içine methoda göndermemiz gereken bilgileri
                hangi variable ile göndereceğimizi yaz (parametre)
            5- döndürülmesi istenen işlemi yap
            6-return keyword kullanarak döndürülmesi istenen değeri döndür
         */
     // int sonuc=   faktoryelHesapla( 5);
      //  System.out.println(sonuc);
       faktoryelHesapla(5);
        System.out.println(faktoryelHesapla(5)*2);
    }
    public static int faktoryelHesapla(int sayi){ // 5
        int sonuc=1;
        for (int i = 1; i <=sayi ; i++) {
            sonuc=sonuc*i;
        }
return sonuc;
        //12345
        //2345
        //645
        //245
    }
}
