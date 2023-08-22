package day05ifelseswitchternary;

import java.util.Locale;
import java.util.Scanner;

public class day05Tekrar {
    public static void main(String[] args) {
        //Example 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num= input.nextInt();
        if (num>0){
            System.out.println("pozitif");

        }else if (num<0){
            System.out.println("negatif");

        }else{
            System.out.println("notr");
        }

        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....
        // scanner kodu yukarda
        System.out.println("lutfen gun sayisini giriniz");
        byte nummer= input.nextByte();
        if (nummer==1){
            System.out.println("monday");

        } else if (nummer==2) {
            System.out.println("Tuesday");

        } else if (nummer==3) {
            System.out.println("wednesda");
            
        } else if (nummer==4) {
            System.out.println("Thursday");
            
        } else if (nummer==5) {
            System.out.println("friday");
            
        } else if (nummer==6) {
            System.out.println("saturday");
            
        } else if (nummer==7) {
            System.out.println("sunday");
            
        }else {
            System.out.println("hatali giris yaptiniz");
        }

         /*
             Example 3:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */
        // scanner yukarda yamiyorum bidaha
        System.out.println("lutfen yasinizi giriniz");
        int age= input.nextInt();
        if (age<0){
            System.out.println("gecerli bir yas giriniz");

        } else if (age<5) {
            System.out.println("bebek");

        } else if (age<13) {
            System.out.println("cocuk");

        } else if (age<21) {
            System.out.println("genc");

        } else if (age<31) {
            System.out.println("yetiskin");

        } else {
            System.out.println("tanimlanmamis yas");

        }

         /*
        kullanicinin vermis oldugu gun isimlerine bakarak haftasonu veya haftaici olduguna karar
        veren kodu yaziniz
        Monday==>>week Day    Saturda===>> Weekend Day
         */

        // scanner kodu yukarda
        System.out.println("Enter a day name");
        String dayName= input.next();
        boolean isWeekendDay= dayName.equalsIgnoreCase("saturday")|| dayName.equalsIgnoreCase("sunday");
        boolean isWeekDay=dayName.equalsIgnoreCase("monday")||dayName.equalsIgnoreCase("Tuesday")||dayName.equalsIgnoreCase("wednesday")||dayName.equalsIgnoreCase("Thursday")||
                dayName.equalsIgnoreCase("Friday");


        if (isWeekendDay){
            System.out.println("Weekend day");

        }else if(isWeekDay){
            System.out.println("Week day");

        }else {
            System.out.println("invalid day name");


        }

        /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;
                60 yasindan buyukse "Emekli Olabilir "yazdirin

               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */

        //scanner kodu yukarda
        System.out.println("cinsiyetinizi griniz");
        String gender= input.next();
        System.out.println("yasinizi giriniz");
        int yas = input.nextInt();
        if (yas<0||yas>120){
            System.out.println("lutfen yas araliginda bir sayi giriniz");

        }else if (gender.equalsIgnoreCase("kadin")){
            if (yas>60){
                System.out.println("emekli olabilir");

            }else{
                System.out.println("kesinlikle calismali");

            }

        }else if (gender.equalsIgnoreCase("erkek")){
            if (yas>65){
                System.out.println("emekli olabili");

            }else{
                System.out.println("kesinlikle calismali");
            }

        }else{
            System.out.println("tanimli deyil");

        }

        //Example  Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7
        // 1. yol

        String dayName1 = "Tuesday";
         if (dayName1.equalsIgnoreCase("sunday")){
             System.out.println(1);
         }else if (dayName1.equalsIgnoreCase("monday")){
             System.out.println(2);
         }else if (dayName1.equalsIgnoreCase("tuesday")){
             System.out.println(3);
         }else if (dayName1.equalsIgnoreCase("wednesday")){
             System.out.println(4);
         }else if (dayName1.equalsIgnoreCase("Thursday")){
             System.out.println(5);
         }else if (dayName1.equalsIgnoreCase("Friday")){
             System.out.println(6);
         }else if (dayName1.equalsIgnoreCase("Saturday")) {
             System.out.println(7);
         }else {
             System.out.println("lutfen gecerli bir gun ismi giriniz");
         }

         // 2. yoll: Switch
        switch (dayName.toLowerCase()){
            case "sunday":
                System.out.println(1);
                break;
            case "monday" :
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                break;
            default:
                System.out.println("lutfen gecerli bir kod giriniz");










        }







    }//main metot sonu
}//package sonu
