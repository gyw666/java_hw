package day13.a01staticdemo1;

public class Student {
    //属性:姓名 年龄 性别
    private String name;
    private int age;
    private String gender;
    public static String teacherName;   //静态变量  被这个类共享,随着类的加载而加载,优先于对象而存在
    //静态变量可以直接用类名赋值  Student.teacherName="xxxx";

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", gender = " + gender + "}";
    }

    //行为
    public void study(){
        System.out.println(name+"正在学习");
    }

    public void show(){
        System.out.println(name+", "+age+", "+gender+", "+teacherName);
    }
}
