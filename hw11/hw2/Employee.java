package hw11.hw2;

public abstract class Employee extends Person {

    private String office;
    private String salary;
    private String date;

    public Employee(){

    }
    public Employee(String name,String address,String phoneNumber,String email,String office, String salary, String date) {
        super(name,address,phoneNumber,email);
        this.office = office;
        this.salary = salary;
        this.date = date;

    }

}
