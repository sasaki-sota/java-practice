package academy.leranprograming;
//クラスやインターフェースをグループ化して分ける仕組み
public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;

        int minIntValue = Integer.MIN_VALUE;
//        最小値を保持する定数
        int maxIntValue = Integer.MAX_VALUE;
//        最大値を保持する定数
        System.out.println("Integer Minmum value = "+ minIntValue);
//        ここで表示されるのは用意されている最大値と最小値の値
        System.out.println("Integer maxmum value =" + maxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
//        byte に設定可能な最小値 (-27) を保持する定数
        byte myMaxByteValue = Byte.MAX_VALUE;
//        byte に設定可能な最大値 (27-1) を保持する定数
        System.out.println("ByteMax =" + myMinByteValue);
        System.out.println("ByteMin = " +myMaxByteValue);

        int myTotal = (myMaxByteValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
//        ここまま使用するとint形のままなのでbyte肩を定義してあげる

        System.out.println(myNewByteValue);
//        ここで半分の値を出力
    }
}
