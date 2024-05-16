package day14.duotaidemo1;

public class Administrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员的信息为:"+this.getName()+","+this.getAge());
    }
}
