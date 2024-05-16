package day13.extenddemo1;

//构造方法不能继承
//成员变量都可以继承,只不过私有的子类无法直接使用,用get set方法
//成员方法(虚方法)非私有可以继承,私有不可继承,只有父类中的虚方法才能被子类继承  非private 非static 非final


//重写的方法名称,形参列表必须和父类中的一致
//重写时写上@Override
//只有被添加到虚方法表中的方法才能被重写
public class Animal {
    public void eat(){
        System.out.println("eat");
    }

    public void drink(){
        System.out.println("drink");
    }
}




