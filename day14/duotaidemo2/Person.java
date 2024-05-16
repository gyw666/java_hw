package day14.duotaidemo2;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPat(Animal a,String food){
        System.out.println("年龄为"+this.getAge()+"岁的"+this.getName()+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的宠物");
        if (a instanceof Cat c){
            c.eat(food);
        }
        if (a instanceof Dog d){
            d.eat(food);
        }
    }
}
