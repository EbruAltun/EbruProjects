package day11_stringManipulations_Forlop;

public class C05_replaceAll {
    public static void main(String[] args) {
        String str= "     J&ava54 C+an01dir,,,   ";

        // str i Java Candir haline getir
        str=str.trim();
        str=   str.replaceAll("\\d",""); //J&ava C+andir,,,
        str= str.replaceAll(" ","5"); //J&ava5C+andir,,,

        str=str.replaceAll("\\W","");  // JavaCandir
        str=str.replaceAll("5"," "); // Java Candir
        System.out.println(str);

    }
}
