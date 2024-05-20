package day15.Inner;

public class Test {
    public static void main(String[] args) {
//        Car.Engine e=new Car().new Engine();
//        Car c=new Car();
        Object e=new Car().getEngine();
        System.out.println(e);

    }
}
