package day13.a01staticdemo2;

public class testDemo {
    public static void main(String[] args) {
        //测试工具类的方法
        int[] arr={1,2,3,4,5,6,7,8,9};
        String s=ArrayUtil.printArr(arr);
        System.out.println(s);
        double aver=ArrayUtil.getAverage(arr);
        System.out.println(aver);
    }
}
