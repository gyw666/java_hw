package day15.abstractdemo1;

public class Student extends Person{
    //假如子类还是抽象类,就不用重写抽象方法了
    @Override
    public void word() {
        System.out.println("学生的工作是学习");
    }

    public Student(){
    }
    public Student(String name,int age){
        super(name,age);
    }
}
