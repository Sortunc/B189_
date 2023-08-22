package day02variables;

import org.w3c.dom.ls.LSOutput;

public class Variables01 {
    public static void main(String[] args) {
        // Variable nasil olusturulur?
        //Date Type + variable Name +Assignment Operator(Atama operatoru)+ Variable deyeri+ noktali virgül;
             int            age                =                                   9            ;
             System.out.println(age);
             // System.out.printeln(); yazdirmanin kisa yolu  .... sout yaz entere bas

/*
javada temelde iki tip data vardir:
1)Primitve data type:
char, boolean, byte, short, int, long, float, double
2) non-primiteve data type:
string*/

// Char data type: 2 byte yer kaplar
// tek karakterler icin kullanilir. örnek  A, a, ?, 5
// Ornek1: Char data type inda bir ismin ilk harfi olarak bir variable olustururnuz ve bir deyer atayiniz
        //Data Type+ Variable Name+ Assigmnment Operator+ Variable deyeri* noktali virgül;
            char     isminIlkHarfi =                         'A';
        System.out.println(isminIlkHarfi);

        //boolean data type:
        //boolean lar sadece iki farkli deyer alabilirler; true veya false(yalnis)
        // Örnek: boolean data type inde emeklimisin sorusu icin bir variable olusturun ve false deyerini atayin
        boolean emeklimisin = false;
        System.out.println(emeklimisin);

        //byte data type:
        //tamsayilar icindir hafizada 1 byta yer kaplar
        //byte: -128 den + 127 e (dahil) kadar tamsayi deyerleri icin kullanilir
        //ornek3: byte data typnde ogrenci yasi icin bir variable olusturunuz ve deyer atayiniz
        byte ogrenciYasi= 13;
        System.out.println(ogrenciYasi);

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu= 1300;
        System.out.println(siteNufusu);


        //int data type:
//tam sayilar icindir hafizada 4 byte yer kaplar
//int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
//Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz
 int ulkeNufusu= 10000;
        System.out.println(ulkeNufusu);



        //long data type:
//tam sayilar icindir hafizada 8 byte yer kaplar
//long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
//Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long cellNumberInHumanBody= 2345566788999000L;
        System.out.println(cellNumberInHumanBody);
        // Note: Eger long a atadginiz deyer int lerin ararliginda ise sonuna L koymaya gerek yok
        //ama int lerin araligi disinda ise bunun long oldugunu sonuna L koyarak java ya söylemeliyiz.
        long weightOfSun= 1234557; // burda rakam cok olmadgi icin int gibi algilaniyor.


        //float data type:
//float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
//float memory'de 4 byte yer kaplar.
        // float olustrdugunuzda sonuna F koymalisiniz cunku java ondalikli sayilari otomatik olarak double kabul eder.
//Ornek 7: Gomlek fiyati icin bir tane variable olusturun
        float gomlekFiyati= 255.99F;
        System.out.println(gomlekFiyati);



        // double data type:
        // doble memoryde 8 byte yer kaplar , virgülden sonra ki rakam daha fazla alir
        // double: virgullu sayilar(ondalik sayilar- decimal numbers) icin kullanilir. (hucre agirligi:0.00000012)
        // örnek: Hucre agirligi icin bir tane variable olustrun.

        double hucreAgirligi= 0.000000122223;
        System.out.println(hucreAgirligi);
// 1.5E-14   1.5 carpi 10 uzeri -14 demektir
            }


        }




