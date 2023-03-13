package day12_forLoops;

public class C08_NestedForloop {
    public static void main(String[] args) {
        // dinamik olarak verilen satır ve sütun sayısına göre
        // yıldızlardan bir dikdörtgen oluşturun

        /*
           * * * * *
           * * * * *
           * * * * *
         */
        int satirSayisi=3;
        int sutunsayisi=5;

        for (int k=1 ; k<=satirSayisi; k++) {
            for (int i = 1; i <=sutunsayisi ; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
