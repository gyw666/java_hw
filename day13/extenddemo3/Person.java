package day13.extenddemo3;
//子类无法继承父类的构造方法,但可以通过super()调用
//子类构造方法第一条默认有super()
//默认先执行父类的无参构造方法,在执行自己
//想要访问父类的有参构造,必须手动书写
public class Person {
    String name;
    int age;
    String school;

    public Person(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Person(){
        //调用本类其他构造方法
        //学校默认值为cqut
        this(null, 0, "重理工");
    }

}
