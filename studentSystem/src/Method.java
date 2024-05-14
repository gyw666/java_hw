import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    //浏览
    public static void browse(ArrayList<Student> list) {
        System.out.format("id\t\tname\tage\t\taddress\n");
        for (Student student : list) {
            System.out.format("%s\t%s\t\t%d\t\t%s\n",
                    student.getId(),
                    student.getName(),
                    student.getAge(),
                    student.getAddress());
        }
    }

    //制表
    public static void makeMenu() {
        System.out.println("-------------欢迎使用学生管理系统---------------");
        System.out.println("1.增加功能");
        System.out.println("2.删除功能");
        System.out.println("3.浏览功能");
        System.out.println("4.查询功能");
        System.out.println("5.修改功能");
        System.out.println("6.退出系统");
        System.out.println("请输入您的选择");
    }


    //检测id是否唯一，唯一则返回下标，不唯一返回-1
    public static int judgeID(String id, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isMaintain(String id, ArrayList<Student> list) {
        return judgeID(id, list) != -1;    //不等于负一说明存在，返回true
    }

    //增加
    public static void addNewStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加学生的id");
        String id = sc.next();
        while (isMaintain(id, list)) {
            System.out.println("您输入的id已存在，请重新输入");
            id = sc.next();
        }
        Student student = new Student();
        student.setId(id);
        System.out.println("请输入要添加学生的姓名");
        student.setName(sc.next());
        System.out.println("请输入要添加学生的年龄");
        student.setAge(sc.nextInt());
        System.out.println("请输入要添加学生的住址");
        student.setAddress(sc.next());
        list.add(student);
        System.out.println("添加成功");
    }

    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除学生的编号");
        String id=sc.next();
        while (!isMaintain(id,list)){
            System.out.println("未查询到要删除学生编号");
            System.out.println("---------------------------");
            System.out.println("1.继续删除");
            System.out.println("2.退出");
            int choose=sc.nextInt();
            if (choose==2){
                return;
            }else {
                id=sc.next();
            }
        }
        int index=judgeID(id,list);
        list.remove(index);
        System.out.println("删除成功");
    }

    public static void searchBrowse(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查询学生的id");
        String id=sc.next();
        while (!isMaintain(id,list)){
            System.out.println("未查询到要查询学生编号");
            System.out.println("---------------------------");
            System.out.println("1.继续查询");
            System.out.println("2.退出");
            int choose=sc.nextInt();
            if (choose==2){
                return;
            }else {
                id=sc.next();
            }
        }
        int index=judgeID(id,list);
        System.out.format("id\t\tname\tage\t\taddress\n");
        System.out.format("%s\t%s\t\t%d\t\t%s\n",
                list.get(index).getId(),
                list.get(index).getName(),
                list.get(index).getAge(),
                list.get(index).getAddress());
    }

    public static void updateStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改学生的编号");
        String id=sc.next();
        while (!isMaintain(id,list)){
            System.out.println("未查询到要修改学生编号");
            System.out.println("---------------------------");
            System.out.println("1.继续删除");
            System.out.println("2.退出");
            int choose=sc.nextInt();
            if (choose==2){
                return;
            }else {
                id=sc.next();
            }
        }
        int index=judgeID(id,list);
        System.out.println("请输入修改后的姓名");
        list.get(index).setName(sc.next());
        System.out.println("请输入修改后的年龄");
        list.get(index).setAge(sc.nextInt());
        System.out.println("请输入修改后的地址");
        list.get(index).setAddress(sc.next());
        System.out.println("修改成功");
    }
    //功能
    public static void functions(int choose, ArrayList<Student> list) {
        switch (choose) {
            case 1: {
                addNewStudent(list);
                break;
            }
            case 2:{
                deleteStudent(list);
                break;
            }
            case 3: {
                Method.browse(list);
                break;
            }
            case 4:{
                searchBrowse(list);
                break;
            }
            case 5:{
                updateStudent(list);
                break;
            }
            case 6: {
                System.out.println("成功退出");
                System.exit(0);
            }
        }
    }
}
