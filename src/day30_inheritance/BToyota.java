package day30_inheritance;

public class BToyota extends Araba{
    String marka="Toyota";
    String akü="Inci aku"; //  bunu özelleştirdik
    String lastiik="Lassa"; // bunu da özelştirdi

    public void motor(){
        System.out.println("Toyotolar cevreci toyota motorlar kullanır");
    }
    public void guvenlik(){
        System.out.println("Toyota araclar extra güvenlik önlemleri barındırır");
    }

}
