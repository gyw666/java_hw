package day13.extengdemo4;

public class Manager extends Employee {
    private double bonus;

    //空参构造
    public Manager() {
    }

    //带参构造
    public Manager(String id, String name, int salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work(){
        System.out.println("管理工作");
    }
}
