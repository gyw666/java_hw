package day18;

public class MathDemo1 {
    public static void main(String[] args) {
        //abs绝对值
        System.out.println(Math.abs(-88));
        System.out.println(Math.abs(88));
        //int -2147483648~2147483647,当取最小值时,最大值超过了int的最大值,(bug)
        System.out.println(Math.abs(Integer.MIN_VALUE));
        //解决方法
        //超过了最大取值范围就会报错
//        System.out.println(Math.absExact(Integer.MIN_VALUE));

        System.out.println("-----------------------------------------");

        //ceil向上取整
        System.out.println(Math.ceil(1.23));
        System.out.println(Math.ceil(1.93));
        System.out.println(Math.ceil(-1.23));
        System.out.println("-----------------------------------------");

        //floor向下取整
        System.out.println(Math.floor(1.23));
        System.out.println(Math.floor(1.93));
        System.out.println(Math.floor(-1.23));

        System.out.println("-----------------------------------------");

        //round四舍五入
        System.out.println(Math.round(1.23));
        System.out.println(Math.round(1.93));
        System.out.println(Math.round(-1.23));


        System.out.println("-----------------------------------------");

        //max取最大值
        System.out.println(Math.max(10,20));
        System.out.println("------------------------------------------------");

        //min最小值
        System.out.println(Math.min(10,20));
        System.out.println("------------------------------------------");

        //pow获取a的b次幂
        System.out.println(Math.pow(2, 3));
        System.out.println("------------------------------------------");

        //sqrt开平方根
        System.out.println(Math.sqrt(4));

        //cbrt开立方根
        System.out.println(Math.cbrt(8));
    }
}
