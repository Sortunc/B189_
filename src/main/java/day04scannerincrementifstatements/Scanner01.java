package day04scannerincrementifstatements;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
        ornek: kullanicidan adini ve soyadini , yasini, boyunu, kilosunu ve medeni durumunu girmesini isteyin.
        ardindan bunlari bir etiketle konsola farkli satirlarda yazdiriniz
         */

        Scanner input=new Scanner(System.in);
        System.out.println("adinizi ve soyadinizi giriniz");
        //nextLine() method u kullanicidan cok kelimeli String almak icin kullanilir
        String fullName =input.nextLine();

        System.out.println("yasinizi giriniz");
        byte age =input.nextByte();

        System.out.println("boyunuzu giriniz");
       float height= input.nextFloat();

        System.out.println("kilonuzu giriniz");
        short weight=input.nextShort();

        System.out.println("medeni durumunuzu giriniz");
        // next method u kullanicidan tek kelimeli string almak icin kullanilir
       String maritalStatus= input.next();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);


    }
}
