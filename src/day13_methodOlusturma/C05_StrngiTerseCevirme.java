package day13_methodOlusturma;

public class C05_StrngiTerseCevirme {
    public static void main(String[] args) {
        // verilen stringi tersine cevirip
        // bize döndüren bir method olusuturun

        System.out.println(stringtersinecevir("Java Candir")); //ridnaC avaJ
        System.out.println(stringtersinecevir("anlasıldı mı"));

    }
    public  static String stringtersinecevir(String metin){
        String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);
        }
        return tersMetin;
    }
}
