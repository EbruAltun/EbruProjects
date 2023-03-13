package day17_arrays;

public class çalışma {

    public static void main(String[] args) {

        String str= "Ebru";

       String result = stringiTersÇevirme(str);
        System.out.println(result);
    }

    public static String stringiTersÇevirme(String str) {

        String sonuç="";

      for (int i = str.length()-1; i>=0;i--){
          sonuç += ""+str.charAt(i);
      }
        return sonuç;
    }


}
