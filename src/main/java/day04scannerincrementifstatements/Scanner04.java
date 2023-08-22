package day04scannerincrementifstatements;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

       //kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamni yazdiran kodu yaziniz
        // 45678==>>>45+78=128

        Scanner input= new Scanner(System.in);
        System.out.println("lutfen bes basamakli bir sayi giriniz");
        int num=input.nextInt();
        // bir tamsayiyi 1000 ne bölersek son uc sayiyi silmis oluruz
        int firstTwo =num/1000;
        // %===>>> modulus operator solunda bulunan sayinin saginda bulunan
        // sayiya bolumunden kalani verir.
        // dolayisiyla %10 herzam bize birler basamagindaki bulunan sayiyiy verir
        int lastTwo =num %100;
        System.out.println(firstTwo+lastTwo);
    }
}
