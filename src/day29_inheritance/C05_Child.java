package day29_inheritance;

public class C05_Child {
    int c=20;
    int a;

    String s = "Child class";
    String m;

    public void method1(){
        System.out.println("child class method1");
    }

    public static void main(String[] args) {

        // child class'dan bir obje olusturalim
        // ve ozelliklerini yazdiralim

        C04_Child obj = new C04_Child();
        System.out.println(obj.a); // 0
        System.out.println(obj.c); // 20 en günceli bu clasta var
        System.out.println(obj.b); // 0 parentte var değeri 0
        System.out.println(obj.m); // null  bu clasta var değeri null
        System.out.println(obj.s); // Child class  bu clastan geld
        System.out.println(obj.t); // null bu clasta yok parente var

        obj.method1(); // child class method1
        obj.method2(); // Parent Method2 calisti içinde bulunduğumuz clasta yok
                             // ama parentte var methot2 o yuzden parenten çaluştı


    }

}


