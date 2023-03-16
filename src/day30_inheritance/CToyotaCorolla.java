package day30_inheritance;

public class CToyotaCorolla extends BToyota {
    String lastik="Lassa 205-55-15";
    String model="Corolla";
    String yakit="Corolla dizel, benzinli ve elektirikli oalbilir";

    public void motor(){
        System.out.println("Corolla araclar Türkiye de ");
    }
public void uretimYeri(){
    System.out.println("Corolla araclar Türkiye de üretilir");
}
    public static void main(String[] args) {
        CToyotaCorolla corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik);  // önce vu clasa bakar var mı yok mu diye // coralla

        System.out.println(corolla.model); // kendi classından var diye buradan yazar Corolla
        System.out.println(corolla.yakit); // Corolla kendi claaında var oldğu için buradan alır
        corolla.motor();        // bu en güncelini yazdırır yanı Corolla Clasıını
        corolla.uretimYeri();     // Corolla yani hep öncelikle bu clasta varsa ona bakar
        System.out.println(corolla.marka);  // Toyota bu clasta  marka diye bişey yok parenta bkar parente var o yüzden parentten kullaır
        System.out.println(corolla.akü);  //  Toyota bu clasta yok parente var parentekini kullanır
        corolla.guvenlik();       // burada yok parente var yine o zamn bunu kullanır
        System.out.println(corolla.vites); // burada yok parente de yok Araba clasından alacak



    }
}
