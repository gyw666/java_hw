package day15.abstractdemo1;

public class Test {
    public static void main(String[] args) {
//        Person person=new Person();  抽象类不能创建对象
        Student s1 = new Student("gyw",18);
        System.out.println(s1);
    }
}
