package day15.pratice1;

public class bkCoach extends Person {
    public bkCoach() {
    }

    public bkCoach(String name,int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教打蓝球");
    }

    public String toString() {
        return "bkCoach{}";
    }
}
