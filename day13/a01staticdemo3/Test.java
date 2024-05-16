package day13.a01staticdemo3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //1.创建一个集合,用于存储学生对象
        ArrayList<Student> students = new ArrayList<>();

        //创建三个学生对象
        Student s1=new Student("gyw",18,"男");
        Student s2=new Student("kyr",19,"女");
        Student s3=new Student("ztj",18,"男");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        int maxAge = StudentUtil.getMaxAgeStudent(students);
        System.out.println(maxAge);

    }
}
