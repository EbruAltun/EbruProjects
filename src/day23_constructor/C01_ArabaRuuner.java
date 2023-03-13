package day23_constructor;

public class C01_ArabaRuuner {
    public static void main(String[] args) {
        Araba araba1= new  Araba();
        System.out.println(araba1);  // day23_constructor.Araba@340f438e
        System.out.println(araba1);  // Araba bilgileri : yil=0, marka='Marka belirtilmemis', model='Model belirtilmemis', hasarliMi=false, fiyat=0}

        // to.string yaptık click yap, sonra code> generatede to stringi sectim
        // bunu yapınca refernas degerini yazdırmadı
        // araba bilgilerni yazdırdı
      araba1.fiyat=20000;
      araba1.marka=" volvo";
        System.out.println(araba1);      // Araba bilgileri : yil=0, marka=' volvo', model='Model belirtilmemis', hasarliMi=false, fiyat=20000}

        Araba araba2= new Araba(10000,"BMW");
        System.out.println(araba2);     // Araba bilgileri : yil=0, marka='BMW', model='Model belirtilmemis', hasarliMi=false, fiyat=10000}

    }


}
