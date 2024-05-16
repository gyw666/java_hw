package day14.duotaidemo2;

public class Test {
    public static void main(String[] args) {
        Person p=new Person("顾砚文",18);
        Cat c=new Cat(2,"灰");
        Dog d=new Dog(3,"黄");
        p.keepPat(c,"鱼");
        p.keepPat(d,"屎");
    }
}
