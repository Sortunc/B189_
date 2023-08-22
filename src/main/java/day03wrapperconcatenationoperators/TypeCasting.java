package day03wrapperconcatenationoperators;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Numeric primitive data type larinin birbirine donusturulmesine Type Casting denir.
        Numeric(sayisal) Dat Type==>>>>byte, short, int, long,float, double

        Note1) kucuk data typelarini buyuk data Typlarina cevirmeyi java otomatik olarak yapabilir bu isleme "AutoWidening"(otomatik genisletme)
        denir.
        Note2) Buyuk data typlerini kucuk data typlarina cevirmek riskli bir istir java bu riski otomatik olarak yapmaz. bu islemi kod yazanlar
        yapar. bu isleme "Explicit Narrowing" (Aciktan Daraltma) denir.
         */
        //ornek:  byte data type ni int data type na ceviriniz
        byte age=13;
        int ageInt= age;//AutoWiddenning

        //ornek: int data Type ni short data Type na ceviriniz.
        int weight =313;
        short weightShort=(short)weight;// Explicit Narrowing
    }
}
