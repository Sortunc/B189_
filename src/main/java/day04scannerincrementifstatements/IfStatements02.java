package day04scannerincrementifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        // ornek2: sayi uc basamakli ise ekrana " sayi uc basamaklidir!" yazdirin
        Scanner input= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num= input.nextInt();

        //1.yoll:
        if(num %2==0){
            System.out.println("Cift Sayi...");
        }

        if(num%2 !=0){
            System.out.println("tek sayi...");
        }

        //2. yol
        // if else Statements(aksi takdirde)
        if (num%2==0){
            System.out.println("cift sayi");
        }else{
            System.out.println("Tek sayi");

        }


    }
}
