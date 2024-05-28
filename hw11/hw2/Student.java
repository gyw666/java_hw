package hw11.hw2;

public class Student extends Person{
    private String grade;

    public Student() {
    }

    public Student(String name,String address,String phoneNumber,String email,String grade) {
        super(name,address,phoneNumber,email);
        this.grade = grade;
    }


    @Override
    public void work() {
        System.out.println("Student work");
    }

    /**
     * 获取
     * @return grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Student{grade = " + grade + "}";
    }
}
