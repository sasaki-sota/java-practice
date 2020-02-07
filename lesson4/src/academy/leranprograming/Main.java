package academy.leranprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
//        float型で宣言された場合に4バイト(32ビット)
        System.out.println("Float minimum = " + myMinFloatValue);
        System.out.println("Float maxmum = " + myMaxFloatValue);
//        少数を表す型定義

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
//        floatとdoubleの違いはビット数の違いこっちは64ビット
        System.out.println("Min =" + myMinDoubleValue);
        System.out.println("Max =" + myMaxDoubleValue);

        int myIntvalue = 5 / 3;
        float myFloatValue = 5f / 3f;
//        この場合は5fは5のfloatとなる
        double myDounbleValue = 5d / 3d;
//        double型にする場合は文末にdoubleのdをつける
//        こっちの方の方が小数点がfloatと同じでも多くなる
        System.out.println("Myint =" + myIntvalue);
        System.out.println("Myfloat =" + myFloatValue);
        System.out.println("Mydouble =" + myDounbleValue);

        double numberOfPounds = 200d;
        double convertedkilograms = numberOfPounds * 0.45359237d;
        System.out.println(convertedkilograms);
//        とても細かく教示するのに使用する場合がある

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
