package day30_inheritance;

public class Araba {

       // marka gozetmeksizin tum arabalarin sahip olacagi ozellikleri
       // bu class'a koyariz

    String marka= "Tüm arabaların markasi olur";
    String model= "Tüm arabaların modeli olur";
    String vites= "Tüm arabalarin vitesi olur";
    String yakit="Tüm arabalar yakitla calisir";


    public void uretimYeri(){
        System.out.println("Tüm arabalar fabrikada üretilir");
    }

    public void motor(){
        System.out.println("Tüm arabaların moturu olur");
    }




}
