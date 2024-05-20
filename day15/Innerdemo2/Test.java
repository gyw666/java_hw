package day15.Innerdemo2;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        new Outer().new Inner().show();
    }
}
