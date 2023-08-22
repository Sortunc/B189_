package day02variables;

public class Variables02 {
    public static void main(String[] args) {
        // ornek9: ogrenci ismi icin variable olusturup deyer olarrak Ali Can atayiniz.

        String ogrenciAdi="Ali Can";
        System.out.println(ogrenciAdi);
        // null 0 demek deyildir. 0 da codingte bir deyerdir
        //null hiclik demektir
        //null ici bos obje demektir
        /*
        Primitive ve non -primite data Type arasindaki farklar nelerdir?
        1)Primitive ler sadece bizim attagimiz deyeri icerir
        non-primitivler bizim atatdgimiz deyeri icerir ve method lar icerir.(interviev sorusu)
        2) primitivler kucuk harfle baslar. non-primitivler buyuk harfle baslar
        3) primitivleri java uretmistir ve 8 tanedir
        non-primitivleri java ve programcilar uretebilir, dolayisylada sinirsiz sayidadidr.
        4)primitivler memoryde de data typlerina göre sabit bellek kullanirlar.
        non-primitivelr icin java memoryde buyukluyune göre deyisen boyutlarda bellek kullananbilirler


         */

        // ornek: ogrenci notlari icin iki adet variable olusturun ve toplamlarini yazdirin.
        // 1.yol
        byte note1= 50;
        byte note2= 70;
        System.out.println(note1+note2);




    }
}
