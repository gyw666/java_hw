package day14.duotaidemo1;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("顾砚文");

        Teacher t1 = new Teacher();
        t1.setAge(19);
        t1.setName("康雨然");

        Administrator a1 = new Administrator();
        a1.setAge(20);
        a1.setName("赵桐吉");

        register(s1);
        register(t1);
        register(a1);
    }

    //为了让这个方法可以接收三个身份,形参写他们的共同父类
    public static void register(Person p){
        p.show();
    }
}
