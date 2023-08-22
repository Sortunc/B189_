package day03wrapperconcatenationoperators;

public class WrapperClass {
    public static void main(String[] args) {
        // java, primitive data typlerina bazi faydali methodlar ekleyerek yeni bir veri yapisi olusturmustr.
        // bu yeni yapi "Wrapper Class" olarak adlandirilir
        // Primitive:      char-boolean- short-byte, -int, -long, -float,-double
        // wrapper Class:  character -Boolean- Short-Byte-Integer-Long-Float-Double

        int n = 12;
        Integer m= 12;
        //ornek: primitive int i wrapper Integer a ceviriniz ==<<<Autoboxing

        int num = 13;
        Integer wrapperNum= num;

        //ornek: Wrapper Byte primitive byte a ceviriniz  ====<<<< Unboxing

        Byte k= 13;
        byte primitiveK= k;


    }
}
