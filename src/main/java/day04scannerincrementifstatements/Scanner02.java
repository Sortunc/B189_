package day04scannerincrementifstatements;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        Scanner input= new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz...");
        double firstNumber =input.nextDouble();
        double secondNumber= input.nextDouble();

        System.out.println("toplam= " +(firstNumber+secondNumber));
        System.out.println("cikarma= " +(firstNumber-secondNumber));
        System.out.println("carpim= " +(firstNumber*secondNumber));
        System.out.println("bolme= " +(firstNumber/secondNumber));


    }
}
