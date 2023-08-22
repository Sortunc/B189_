package day04scannerincrementifstatements;

public class IfStatements01 {
    public static void main(String[] args) {
        // if Statements
        // bazi kodlarin bazi sartlara göre aktive edebilmek icin if statements kullanilir.
        // if you study hard, you will learn java.==>>> Englisch
       /*
       if (you study hard){you will learn }
    java====>>> java
        */
        // örnek:1 sayi -1 ile 10 arasinada ise ekrana "Rakam" yazdirin.
        int number = 3;

        if (number >-1 && number <10) {
            System.out.println("rakam");

        }

        // ornek2: sayi uc basamakli ise ekrana " sayi uc basamaklidir!" yazdirin

        int n = 123;
        if (n>99&&n<1000){
            System.out.println("sayi uc basamaklidir");
        }



    }
}
