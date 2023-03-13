package day07_genelTekrar_IfElse;

public class C01_DataCasting {
    public static void main(String[] args) {
        //  javada bazı data türleri asla başka data türlerine çevrilemez
        /*
         String str= false;
         String str1= 20;
         boolean aa= 'a';
         */
        // özellikle sayısal data türündeki değerler
        // başka sayısal data türündeki variablere atanabilir
 double dBl=23;
 short sht= 12;
 int sy1= sht;
        // daha dar data türündeki değeri, daha geniş data türündeki variableye atamaya
        //autowiddenig denir ve java bunu otomatik yapar,

        sht=(short) sy1;
        sy1= (int) dBl;

        // daha geniş data türündeki değeri, daha dar data türündeki variableye atamaya
        //exclipitnarowing denir ve java bunu otomatik yapmaz ve bizden müdahle ister

        sy1='k';
        if(sy1>'k'){

        }
    // char data türündkei değerler sayısal işlemde kullanılabilir
        // bir char matematiksel işlemde kullanılırsa ASCI tablo değeri ile işleme girer

        System.out.println('k' + 2); // 109
        // eğer bu işlemi sayısal olarak isterseö
        // char a cast edebilirsin
        System.out.println((char) ('k'+2)); // m
       // Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin

      char harf= 'a';
        System.out.println((char) ('a'+1));  // b
        System.out.println( (char) (harf+2)); // c
        System.out.println( (char) (harf+3)); // d
    }
}
