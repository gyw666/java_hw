package day13.extenddemo2;
//父类中的构造方法无法被继承
//子类中的所有构造方法都默认先访问父类中的无参构造,再执行自己
//子类的构造方法第一行默认是super(),不写也存在,而且必须在第一行
//如果想调用父类的有参构造,必须手动写super进行调用
public class Dog {
    public void drink(){
        System.out.println("喝水");
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void lookHome(){
        System.out.println("看家");
    }
}
