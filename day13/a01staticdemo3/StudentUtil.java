package day13.a01staticdemo3;
//静态方法只能访问静态变量和静态方法
//非静态什么都可以
//静态方法中没有this关键字
import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){
    }

    public static int getMaxAgeStudent(ArrayList<Student> students){
        int maxAge = students.get(0).getAge();
        for(Student student : students){
            if(student.getAge() > maxAge){
                maxAge = student.getAge();
            }
        }
        return maxAge;
    }
}
