package day14.duotaidemo1;

public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师的信息为:"+this.getName()+","+this.getAge());
    }
}