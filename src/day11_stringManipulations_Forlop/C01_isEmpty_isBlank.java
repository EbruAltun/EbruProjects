package day11_stringManipulations_Forlop;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {
        String str="Java Candır";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false

        str="   ";

        System.out.println(str.isEmpty()); // false
        System.out.println(str.length());  // 3
        System.out.println(str.isBlank()); // true

        str="";
        System.out.println(str.isEmpty()); // true
        System.out.println(str.length()); // 0
        System.out.println(str.isBlank()); // true


    }

}
