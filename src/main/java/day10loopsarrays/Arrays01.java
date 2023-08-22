package day10loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 13;


        //Array nasil olusturulur?
        String stdNames [] = new String[5];

        //Arrayler console a nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));

        //toString() methodunu kullanmadan sadece array ismi ile yazdirirsaniz java o Arrayin adresini yazdirir

        //Array e eleman ekleme nasil yapilir?
        stdNames [2] ="Alperen";
        stdNames [4] ="Cemil";
        stdNames [3] ="Tuba";
        stdNames [1] ="Ahmet";
        stdNames [0] ="Ahmet Saim";
        System.out.println(Arrays.toString(stdNames));

        //Array dan specific bir elemani almak?
        System.out.println(stdNames[2]);//Alperen

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        // Note: Stringlerde kullandigimiz length() metodtur.
        // aarylarda kullandigimiz length variable dir.
        String cities []= new String[5];
        cities [0]= "Miamii";
        cities [1]= "Sivas";
        cities [2]= "Frankfurt";
        cities [3]= "Yozgat";
        cities [4]= "Ankara";
        // 1. yol for loop

        int toatalChar=0;

        for (int i = 0; i <cities.length ; i++) {
            toatalChar= toatalChar+cities[i].length();
            System.out.println(toatalChar);


        }

        //2.yol for-each loop(enhanced loop)
        int sum= 0;
        for ( String w : cities ){
            sum=sum+w.length();
            System.out.println(sum);

        }



    }
}
