package day15.interfacedemo1;

public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗在狗刨");
    }
}
