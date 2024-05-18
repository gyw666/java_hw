package day15.pratice1;

public class ppCoach extends Person implements Study{

    public ppCoach() {
    }

    public ppCoach(String name,int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教打乒乓球");
    }

    public String toString() {
        return "ppCoach{}";
    }

    @Override
    public void study() {
        System.out.println("乒乓球教练学英语");
    }
}
