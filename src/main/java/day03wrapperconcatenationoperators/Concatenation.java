package day03wrapperconcatenationoperators;

public class Concatenation {
    public static void main(String[] args) {
        // Ornek : Bir String ve iki integer variable olusturun. String degeri ile Integer larin toplamini console yazdirin

        String s = "Elma";
        int a = 10;
        int b= 11;
        System.out.println(s+a+b);
        System.out.println(s+a*b);
        System.out.println(s+(a+b));
        System.out.println(a+b+s);
        System.out.println(a+s+b);
        // java da "+" sembolu iki sayi arasinda kullanilirsa toplama islemi olur.
        //java da "+" sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa "concatenation" islemi olur
        //"concatenation" islemi birlestirme islemi yapar.
        // Note: concatenation islemlerinde java matematiksel islem onceliyine dikkat eder.
        /*Matematikte islem onceliyi

        1)once uslu sayilar
        2)parantez ici islemler
        3)carpma ve bolmeler
        4)toplama ve cikarmalar
        5)ayni oncelikli olanlar soldan saga oncelik alir
         */
    }
}
