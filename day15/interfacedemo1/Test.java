package day15.interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("asdf",12);
        f.eat();
        f.swim();

        Rabbit r = new Rabbit();
        r.eat();
    }
}
