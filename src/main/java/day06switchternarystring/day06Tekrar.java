package day06switchternarystring;

import java.util.Scanner;

public class day06Tekrar {
    public static void main(String[] args) {
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December
        Scanner input=new Scanner(System.in);
        System.out.println("baslangic ayinin kacinci ay oldugunu giriniz");
        int numOfMonth = input.nextInt();
        switch(numOfMonth){
            case 1:
                System.out.println("january");
            case 2:
                System.out.println("fabruary");
            case 3:
                System.out.println("march");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("oktober");
            case 11:
                System.out.println("nowember");
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("lutfen gecerli bir a girinz");
        }





        //Example 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0

        int c= 4;
        int result = c<0 ? -1*c : c;
        System.out.println(result);


        //Example 2: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.


        int a= 13;
        int b= 7;

        Object result2 = (a>0 && b>0)  ||  (a<0 && b<0) ? a*b : "farkli isaretleri carpamiyorum";


        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int d= -313;
        d= Math.abs(d);
       String result3= d>99 && d<1000 ? "uc basamaklidir" : " uc basamakli degildir";



    }
}
