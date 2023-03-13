package day08_nestedIfElse_ternary;

public class C07_Ternary {

    public static void main(String[] args) {
       // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
          int k= 10;
          int k2= 12;
          int k3= 12;
        System.out.println(k==k3 && k==k2 && k>0 ? "eskenar ucgen" : "eskenar deil");
    }
}
