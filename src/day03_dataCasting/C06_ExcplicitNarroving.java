package day03_dataCasting;

public class C06_ExcplicitNarroving {
    public static void main(String[] args) {
         double dbl= 45.666;
         int int1= (int) dbl;

        System.out.println(int1); // 45 ondalıklı kısmı almaz

        dbl=389475489745678d;
        int1=(int) dbl;
        System.out.println(int1);//2147483647

        int1=34;
        byte byt=(byte) int1;
        System.out.println(byt); //34

        int1=130;
        byte by=(byte) int1;
        System.out.println(by); //-126

    }
}
