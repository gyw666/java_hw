package day18;

public class SystemDemo1 {
    public static void main(String[] args) {
/*        0:表示当前虚拟机正常停止
        非0:虚拟机异常停止*/
//        System.exit(0);
/*        long l = System.currentTimeMillis();
        System.out.println(l);*/
        //时间原点是1970年一月一日0:0:0,我国在东八区,有八小时时差
        //1s=1000ms
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            if (isPrime1(i)) {
//                System.out.println(i);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("isPrime1:  " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            if (isPrime2(i)) {
//                System.out.println(i);
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("isPrime2:  " + (endTime - startTime));

//        System.arraycopy();
        //如果是基本数据类型,必须相同
        //需考虑长度,过长也会报错
        //如果是引用数据类型,子类类型可以赋值给父类类型
//        System.exit(0);


    }

    public static boolean isPrime1(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
