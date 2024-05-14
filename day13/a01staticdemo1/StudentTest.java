package day13.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //创建第一个学生对象
        Student s1 = new Student();
        s1.setName("顾砚文");
        s1.setAge(18);
        s1.setGender("男");
//        s1.teacherName="帅哥";
        Student.teacherName = "帅哥老师";
        s1.show();
        s1.study();

        //创建第二个学生对象
        Student s2 = new Student();
        s2.setName("康雨然");
        s2.setAge(19);
        s2.setGender("女");
        s2.show();
        s2.study();
    }
}
