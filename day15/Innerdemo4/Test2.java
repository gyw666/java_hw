package day15.Innerdemo4;

public class Test2 {
    //匿名内部类可以写在成员位置,也可以写在局部位置
    public static void main(String[] args) {
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("重写后的方法");
            }
        };
        s.swim();


        System.out.println("------------------------------");


        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写后的方法");
            }
        }.swim();
    }
}
