package day14.finaldemo2;

public class Test {
    final double PI = 3.14;

    public static void main(String[] args) {
        final Student s = new Student("张三", 18);
        //s存储的是地址值,该值不能修改,但在堆区该地址值记录的数据可以修改
        s.setAge(11);
        System.out.println(s);
    }

}
