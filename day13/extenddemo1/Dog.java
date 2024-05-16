package day13.extenddemo1;

public class Dog extends Animal {
    public void lookHome(){
        System.out.println("dog look home");
    }
    @Override
    public void eat(){
        System.out.println("dog eat meat");
    }
}
