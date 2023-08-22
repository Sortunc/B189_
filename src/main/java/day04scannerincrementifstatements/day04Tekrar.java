package day04scannerincrementifstatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class day04Tekrar {
    public static void main(String[] args) {
         /*
        ornek: kullanicidan adini ve soyadini , yasini, boyunu, kilosunu ve medeni durumunu girmesini isteyin.
        ardindan bunlari bir etiketle konsola farkli satirlarda yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adinizi ve soyadinizi giriniz");
        String fullName= input.nextLine();
        System.out.println("lutfen yasinizi giriniz");
       byte age =input.nextByte();
        System.out.println("lutfen boyunuzu giriniz");
       float height= input.nextFloat();
        System.out.println("lutfen kilonuzu giriniz");
        short weight= input.nextShort();
        System.out.println("lutfen medeni durumunuzu giriniz");
        String maritalStatus= input.next();


        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);

        // kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        // yukarda scanner kodu oldzgu icin tekrar yazmiyorum



        System.out.println("lutfen iki sayi giriniz");
        double firstNumber =input.nextDouble();
        double secondNumber =input.nextDouble();
        System.out.println("toplam="+(firstNumber+secondNumber));
        System.out.println("cikarma="+(firstNumber-secondNumber));
        System.out.println("bölme="+(firstNumber/secondNumber));
        System.out.println("carpma="+(firstNumber*secondNumber));

        //örnek: kullanicidan bir dikdortgenin iki kenar uzunlzgunu aliniz
        //1) Alani hesaplayiniz===>>>kisa kenar*uzun kenar
        //2) Cevresini hesaplayiniz==>>>2*kisa kenar+2*uzun kenar

        // scanner kodu yukarda tekrar yazmiyorum

        System.out.println("dikdortgenin kisa kenar uzunlugunu giriniz");
        float shortSide= input.nextFloat();

        System.out.println("dikdortgenin uzun kenar uzunlugunu giriniz");
        float longSide= input.nextFloat();

        System.out.println("Alan="+ (longSide*shortSide));
        System.out.println("cevre="+(2*shortSide+2*longSide));

        //kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamni yazdiran kodu yaziniz
        // 45678==>>>45+78=128

        // scanner yukarda old icin yazmiyorum tekrar
        System.out.println("lutfen bes basamakli bir sayi giriniz");
       int num= input.nextInt();
        int firstTwo= num/1000;
        int lastTwo=num%100;
        System.out.println(firstTwo+lastTwo);

        // örnek:1 sayi -1 ile 10 arasinada ise ekrana "Rakam" yazdirin.
        int number= 3;
                if(number>-1&&number<10){
                    System.out.println("rakam");
                }

        // ornek2: sayi uc basamakli ise ekrana " sayi uc basamaklidir!" yazdirin

         int n= 123;
                if (n>99 && n<1000){
                    System.out.println("sayi uc babsamaklidir");
                }

        // ornek2: sayi uc basamakli ise ekrana " sayi uc basamaklidir!" yazdirin
        // scanner kodu yukarda
        System.out.println("lutfen bir sayi giriniz");
                if (num%2==0){
                    System.out.println("cift sayi...");
                }

                if (num%2!=0){
                    System.out.println("Tek sayidir");
                }










    }



    }