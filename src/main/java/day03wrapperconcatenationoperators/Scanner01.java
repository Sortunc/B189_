package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 1. Adim :Scanner01 class tan object olustur.
        Scanner input =new Scanner(System.in);


        //2.Adim: Kullaniciya ne istediyinize dair mesaj veriniz
        System.out.println("Lütfen yasinizi giriniz");

        //3.Adim:  uygun methodu kullanarak kullanicinin verdiyi data yi memorye yerlestiriniz.
       byte age= input.nextByte();
        System.out.println(age);
    }
}
