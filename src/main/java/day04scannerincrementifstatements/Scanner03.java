package day04scannerincrementifstatements;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        // kullanicidan bir dikdortgenin iki kenar uzunlzgunu aliniz
        //1) Alani hesaplayiniz===>>>kisa kenar*uzun kenar
        //2) Cevresini hesaplayiniz==>>>2*kisa kenar+2*uzun kenar
        Scanner input= new Scanner(System.in);
        System.out.println(" dikdortgenin kisa kenar uzunlugunu giriniz");
        float shortSide =input.nextFloat();

        System.out.println(" dikdortgenin uzun kenar uzunlugunu giriniz");
        float longSide =input.nextFloat();

        System.out.println("Alan="+ (shortSide*longSide));
        System.out.println("Cevre="+ (2*shortSide+2*longSide));
    }
}
