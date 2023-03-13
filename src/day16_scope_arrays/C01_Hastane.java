package day16_scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {
        ADoktor dok1= new ADoktor();
        System.out.println(dok1.askerlikYaptimi);  //  false
        dok1.isim="kemal";
        dok1.soyisim="al";
        dok1.dogumYili=1980;
        System.out.println(dok1.isim);  // kemal

        ADoktor dok2= new ADoktor();
        System.out.println(dok2.isim); // null
        dok2.soyisim="ebru";
        System.out.println(dok2.soyisim); // ebru

        System.out.println(dok1);  //day16_scope_arrays.ADoktor@340f438e
        System.out.println(ADoktor.fakülte); // tip
        System.out.println(dok2.fakülte); // tip

        dok1.isim= "burcu";
        System.out.println(dok2.isim); // null

        dok1.fakülte="tip fakültesi";
        System.out.println(dok2.fakülte);// tip fakültesi

        ADoktor dok3= new ADoktor();
        System.out.println(dok3.dogumYili); // 0
        System.out.println(dok3.fakülte); // tığ

    }
}
