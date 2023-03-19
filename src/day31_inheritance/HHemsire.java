package day31_inheritance;

public class HHemsire extends FMuhasebe{

        String unvan = "Hemsire";
        public void standartMaas(){
            System.out.println("Hemsireler min. 10bin tl maas alir");
        }
        public void ozelSigorta(){

            System.out.println("Hemsireler aylik 300 tl katki ile ozel sigorta yaptirabilir");
        }
        public void nobetUcreti(int nobetSayisi){

            System.out.println(nobetSayisi*200);
        }

    public static void main(String[] args) {
        HHemsire hemsire= new HHemsire();
        hemsire.method();
        }


        public void  method() {
            System.out.println(this.unvan); // hemsire bu clastaki
            System.out.println(super.unvan); // personel
            System.out.println(this.sgkNo);// Calisan   parenttan
            System.out.println(super.sgkNo); // Calisan   direk parente gider
            this.standartMaas(); // 10000 bu clasta var yazdırır
            this.fazlaMesai(3); // 600 bu clasta yok parenten alır
            super.fazlaMesai(4); // 800
            this.ozelSigorta();// aylik 300  //  bu clastan yazar
            super.ozelSigorta(); // Personel  // direk psrente ords yok
        }
    }


