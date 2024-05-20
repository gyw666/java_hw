package day15.Innerdemo4;

public class Test {

    //匿名内部类


    /*


    new 类名/接口名(){
        重写方法
    };


     */

    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };


        new Animal(){

            @Override
            public void eat() {

            }
        };

        method(
                new Animal(){
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
    }

    //多台,编译看左边,运行看右边
    public static void method(Animal a){
        a.eat();
    }
}
