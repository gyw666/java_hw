package day15.pratice1;

public class bkAthlete extends Person {
    public bkAthlete() {
    }

    public bkAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("蓝球运动员学打篮球");
    }



    public String toString() {
        return "bkAthlete{}";
    }
}
