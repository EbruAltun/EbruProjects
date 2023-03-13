package day11_stringManipulations_Forlop;

public class C06_replace {
    public static void main(String[] args) {
        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //      input1 : “15.30 €” , input2 : “11.40 €”
        //      output : 26.70 €

        String input1= "15.30 €";
        String input2= "11.40 €";

        // intput larda digit olmayan herşeyi yok edelim

        input1= input1.replaceAll("\\D",""); // 1530
        input2=input2.replaceAll("\\D","");  // 1140

        // digit olmayanları yok ettik ama String oldukları için toplayamayız
        // int a parse etmek lazım

        double inp1=Double.parseDouble(input1);
        double inp2=Double.parseDouble(input2);
        System.out.println((inp2+inp1)/100+"€");  // 26.7


    }
}
