package day11_stringManipulations_Forlop;

public class C07_SifreKontrol {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        // soruyu if else ile yaparsak sadece 1 hata yazdirir, otekilere bakmaz
        // bagimsiz 4 if-else cumlesi olmali
        // en sonda 4 sarti'da sagladigini kontrol eden bir variable kullanacagiz

        int flag=0;
        String sifre="ejkajıuaı12";

       // ilk harf küçük harf olmalı

        if(sifre.charAt(0)>='a'&& sifre.charAt(0)<='z'){  // char  oldugu için tek tırmnak alamyı unutma
            flag++;
        }else {
            System.out.println("ilk karakter küçük harf olamlı");
        }

        // son karakter rakam olmalı
        char sonHaarf= sifre.charAt(sifre.length()-1);
        if(sonHaarf>='0' && sonHaarf<='9'){
            flag++;

        }else {
            System.out.println("son karakter rakam olmalı");
        }

        //şifre boşluk içermemeli
        if(sifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
        }else {
            flag++;
        }

        // uzunluğu en az 10 karakter olmalı
        if(sifre.length()>=10){
            flag++;
        }else {
            System.out.println("şifrenin uzunluğu en az 10 karakter olmalıdır");
        }
      // şifre tüm şartları sağlarsa "şifre başarıyla kaydedildi " yazdır
        if(flag==4){
            System.out.println("şifre basarıyla kaydedildi");
        }
    }
}
