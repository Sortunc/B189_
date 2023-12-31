package day10loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int ages[]=new int[6];

        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));// 20,23,19,44,15,32
        //1.yoll

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//15,19,20,23,32,44
        //Note: sort() metodu sayisal data type larini kucukten buyuye siralarlar,(ascending order)
        //: sort() metodu String data type larini alfabetik siralarlar(alphabetical order)
        //: (ascending order)+(alphabetical order)==>>>> natural order
        // sort() metodu array elemanlarini natural order a göre siralar

        System.out.println(ages[0] + ages[ages.length-1]);


        //2.yoll

        int minumum = ages[0];
        int maximum= ages[0];
        for (  int w:  ages ){
            minumum=Math.min(minumum,w);
            maximum= Math.max(maximum,w);
            System.out.println(minumum);
            System.out.println(maximum);
            System.out.println(maximum+minumum);


        }




    }
}
