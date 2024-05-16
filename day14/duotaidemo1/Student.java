package day14.duotaidemo1;

public class Student extends Person {
    @Override
    public void show(){
        System.out.println("学生的信息为:"+this.getName()+","+this.getAge());
    }
}
