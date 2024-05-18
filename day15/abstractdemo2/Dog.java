package day15.abstractdemo2;

public class Dog extends Animal {
    public Dog(String name,int age) {
        super(name,age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    public String toString() {
        return "Dog{}";
    }
}
