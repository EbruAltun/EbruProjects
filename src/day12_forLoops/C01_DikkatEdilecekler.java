package day12_forLoops;

public class C01_DikkatEdilecekler {
    public static void main(String[] args) {
        for (int i =20; i < 10; i++) {
            System.out.println(i+" ");

        }
        // for loop calıştı ancak ilk değer için bitiş şartı falsee
        // verdiğinden loop badysi hiç devrye girmedi

        for (int i = 0; i < 10; i--) {
            System.out.println(i +" ");
        }
        // loop başladıktan sonra artış azalış yöntemi sebebiyle
        // bitş değerinden uzaklaşıyorsa loop teorik olarak sonsuza kadar çalışır
        // sonsuz loop denir
    }
}
