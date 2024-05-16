package day13.extenddemo3;

public class Student extends Person{

    public Student(){
        //子类构造方法中有隐藏的super()去访问父类的无参构造,而且必须在第一行
        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age,String school){
        super(name, age,school);
    }
}
