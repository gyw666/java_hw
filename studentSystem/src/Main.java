import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student s1=new Student("sg01","gyw",18,"chongqing");
        Student s2=new Student("sg02","kyr",19,"chongqing");
        Student s3=new Student("sg03","ztj",20,"qingdao");
        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Scanner sc=new Scanner(System.in);
        String[] s=new String[list.size()];
        App.main(s);
        while (true){
            Method.makeMenu();
            Method.functions(sc.nextInt(),list);
        }




    }
}