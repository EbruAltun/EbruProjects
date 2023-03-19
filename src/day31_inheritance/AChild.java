package day31_inheritance;

import day30_inheritance.GParent;

public class AChild extends GParent{
    String childStr;
    AChild(){
        // görünmeyen super () var parent clasteki parametssiz constrotur ıçalıştır demek
        System.out.println("Child class constructur çaliştı");

    }

    public static void main(String[] args) {
        // System.out.println(childStr); // childStr static olmadığı için çalışmadı
        //  System.out.println(sayiParent); // sattaic değil
        // System.out.println(sayiGrandparent); sttaic değil

        AChild objeChild =new AChild();

        /*     /*
            Java'da inheritance kullanirken
            child class'daki obje parent class(lar)'daki tum ozelliklere sahip olur
            bunu saglayan Java mekanizmasi super() constructor call'dur.
            Extends keyword kullanan bir class'da
            olusturulan her bir constructor'in ilk satirinda
            biz gormesek bile super() vardir
            super() ==> once parent class'a gidip oradaki parametresiz constructor'i calistir demektir
            bu sekilde child class'daki constructor calistiginda
            extends keyword kullanmayan parent buluncaya kadar
            parent class'lara gider.
         */


    }


}
