package day15.interfacedemo1;

public interface Swim {
    //接口中只能是常量, public static final,默认用这个修饰
    //接口与接口之间是继承关系,可以多继承,也可以单继承
    //类实现子接口时,要重写所有的抽象方法
    //类跟类之间是继承关系,只能单继承,不能多继承,但可以多层继承
    //类与接口之间是实现关系,可以单实现,也可以多实现
    public abstract void swim();
}
