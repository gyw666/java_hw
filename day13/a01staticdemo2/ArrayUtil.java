package day13.a01staticdemo2;

public class ArrayUtil {
    //私有化构造方法
    //目的是不让外界创建他的对象
    private ArrayUtil() {
    }

    //需要定义为静态的,方便调用
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    public static double getAverage(int[] arr) {
        double sum = 0;
        for (double x : arr) {
            sum += x;
        }
        return sum / arr.length;
    }

}
