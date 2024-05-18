package day15.pratice1;

public class ppAthlete extends Person implements Study{
    public ppAthlete() {
    }

    public ppAthlete(String name,int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("乒乓球运动员学打乒乓球");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学英语");
    }

    public String toString() {
        return "ppAthlete{}";
    }
}
