package day02_dataTürleri_Scanner;

public class C02_DataTürleri {

    public static void main(String[] args) {
         char ilkHarf= '8';// tek tırnak içinde tek harf tek karakter (harf, sayı, özl kkarakter)

        byte ögrencıYası= 15;
        short ögrencıYası2= 16;
        long ögrencYası3= 7;

         double sayı=3.5555789557856898978944;
        System.out.println(sayı); // 3.55557895578569
        // doubble virgülden sonra 16 basamak yazdırır.ama cokküçük sayılara indiği için
        // ondalıklı kısmının soununda hatalar olabilr.
        //15/5 3.0000 3.9999999 3.0

        float sayı1= 45.8579455947555895f;
        // float sayı tanımlanığımızda double dan farklı olduğunuu bellrtmek için
        // sonuna f ya da F yazmak zorundayız
        System.out.println(sayı1); // 45.857944

        // tamsayılar için int, ondalıklı sayılar için double kullanaıcaz..
    }
}
