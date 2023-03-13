package day15_doWhileLoop_scope;

public class C02_RakamalrToplamınıBul {
    public static void main(String[] args) {
        // verilen pozitif bir tamsayının
        // rakamalar toplamını bize döndüren

    }
    public static int rakamlarToplamınıBul(int verilenSayi){
        int sayı=verilenSayi;
        int birlerBasamağı=0;
        int rakamlarToplami=0;

        int basamakSayisi=(sayı+"").length();

        for (int i = 1; i <=basamakSayisi ; i++) {
            birlerBasamağı=sayı%10;
            rakamlarToplami+=birlerBasamağı;
            sayı/=10;


        }
        return rakamlarToplami;




    }
}
