package day12_forLoops;

public class C07_NestedForloop {
    // verielen değer içim çarpım tablosu oluşturun
    public static void main(String[] args) {
        int sayı = 5;

        /*

            1 2 3 4 ==> 1*1 1*2 1*3 1*4
            2 4 6 8 ==> 2*1 2*2 2*3 2*4
            3 6 9 12==> 3*1 3*2 3*3 3*4
            4 8 12 16==> 4*1 4*2 4*3 4*4
         */
        int k=1;


        for (int i = 1; i <= sayı; i++) {
            System.out.print(k*i + " ");
        }
        System.out.println("");
        k++;
        for (int i = 1; i <= sayı; i++) {
            System.out.print(k * i + " ");
        }
        System.out.println("");
        k++;
        for (int i = 1; i <= sayı; i++) {
            System.out.print(k * i + " ");
        }
        System.out.println("");
        k++;
        for (int i = 1; i <= sayı; i++) {
            System.out.print(k * i + " ");

        }
        System.out.println();
        System.out.println("========");
        for (int m = 1; m <=sayı ; m++) {
            for (int i = 1; i <=sayı ; i++) {
                System.out.print(m*i+ " ");

            }
            System.out.println("");
        }

    }
}
