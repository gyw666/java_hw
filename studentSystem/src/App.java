import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u=new User("gywnb1","1","111111111111111111","11111111111");
        list.add(u);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码 4.退出");
            String choice = sc.nextLine();
            switch (choice) {
                case "1" -> {
                    login(list);
                    return;
                }
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");

            }
        }
    }

    private static void forgetPassword(ArrayList<User> list) {
        System.out.println("请输入你要查找的用户名");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        User user = searchUser(list, username);
        if (user == null) {  //不存在
            System.out.println("您输入的用户名不存在");
            return;
        }
        //运行到这里说明用户名存在
        //接下来输入身份证和电话，找回密码
        System.out.println("请输入您的身份证号");
        String personID = sc.nextLine();
        System.out.println("请输入您的电话号码");
        String phoneNumber = sc.nextLine();
        for (int i = 0; ; i++) {
            if (personID.equals(user.getPersonID()) && phoneNumber.equals(user.getPhoneNumber())) {
                //成功找回
                System.out.println("您的密码为：" + user.getPassword());
                break;
            } else {
                System.out.println("输入错误，请重新输入，您还有" + (2 - i) + "次机会");
                if (i == 2) {
                    System.out.println("登录失败，账号已锁定，请联系管理员");
                    return;
                }
                System.out.println("请输入您的身份证号");
                personID = sc.nextLine();
                System.out.println("请输入您的电话号码");
                phoneNumber = sc.nextLine();
            }
        }
    }

    private static User searchUser(ArrayList<User> list, String username) {
        for (User user : list) {
            if (username.equals(user.getUsername())) {
                return user;
            }
        }
        return null;
    }

    private static void register(ArrayList<User> list) {
        System.out.println("注册");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        //开发细节：先验证格式是否正确，在验证是否唯一
        //因为在以后开发中验证是否唯一需要联网使用数据库，比较浪费性能，这种操作一般放在最后
        //用户名长度必须在3~15位之间
        //只能是数字加字母，不能是纯数字
        //用户名唯一
        while (!(checkUsername(username) && uniqueName(username, list))) {
            System.out.println("请重新输入");
            username = sc.nextLine();
        }
        System.out.println("请输入您的密码");
        String password = sc.nextLine();
        System.out.println("请再次确认您的密码");
        String secPassword = sc.nextLine();
        while (!password.equals(secPassword)) {
            System.out.println("两次输入密码不同，请重新输入");
            System.out.println("请输入您的密码");
            password = sc.nextLine();
            System.out.println("请再次确认您的密码");
            secPassword = sc.nextLine();

        }
        System.out.println("密码设置成功");
        System.out.println("请输入您的身份证号");
        //接下来输入身份证号
        String personID = sc.nextLine();
        while (!checkPersonID(personID)) {  //不正确重新输入
            System.out.println("输入错误，请重新输入");
            personID = sc.nextLine();
        }
        System.out.println("身份证号设置成功");
        System.out.println("请输入您的手机号");
        String phoneNUmber = sc.nextLine();
        while (!checkPhoneNumber(phoneNUmber)) {
            System.out.println("输入错误，请重新输入");
            phoneNUmber = sc.nextLine();
        }
        System.out.println("手机号设置成功");
        System.out.println();
        System.out.println();
        User u = new User(username, password, personID, phoneNUmber);
        list.add(u);
        System.out.println("恭喜您注册成功");
        System.out.println();
        browseUser(list);
        System.out.println();

    }

    private static void browseUser(ArrayList<User> list) {
        for (User user : list) {
            System.out.println(user);
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度为11位
        //1开头
        //必须都是数字
        if (phoneNumber.length() != 11) {  //位数不为11
            return false;
        }
        if (phoneNumber.charAt(0) != '1') {   //不以1开头
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {   //有存在不是数字的
            if (!(phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkPersonID(String personID) {
//      长度为18位
//		不能以0为开头
//		前17位，必须都是数字
//		最为一位可以是数字，也可以是大写X或小写x
        if (personID.length() != 18) {
            return false;   //不是十八位返回false
        }
        if (personID.startsWith("0")) {    //如果以0开始，返回false
            return false;
        }
        //检查前十七位是否都是数字
        for (int i = 0; i < personID.length() - 1; i++) {
            if (!(personID.charAt(i) >= '0' && personID.charAt(i) <= '9')) {   //不是数字
                return false;
            }
        }
        char c = personID.charAt(personID.length() - 1);
        if (!((c >= '0' && c <= '9') || (c == 'x') || (c == 'X'))) {
            return false;
        }

        return true;

    }

    private static boolean checkUsername(String username) {
        //检查位数
        if (username.length() < 3 || username.length() > 15) {
            return false;
        }
        //如果运行到这里则说明位数符合
        //接下来检查是否只有字母和数字
        for (int i = 0; i < username.length(); i++) {
            if (!((username.charAt(i) <= 'z' && username.charAt(i) >= 'a') || (username.charAt(i) <= 'Z' && username.charAt(i) >= 'A') || (username.charAt(i) <= '9' && username.charAt(i) >= '0'))) {
                return false;
            }//条件为 大写 小写 数字 再取反，也就是说不是这些的情况下返回false
        }
        //检查是否同时存在字母和数字
        boolean flag1 = false;//字母
        boolean flag2 = false;//数字
        for (int i = 0; i < username.length(); i++) {
            if ((username.charAt(i) <= 'z' && username.charAt(i) >= 'a') || (username.charAt(i) <= 'Z' && username.charAt(i) >= 'A')) {
                flag1 = true;
            }
            if (username.charAt(i) <= '9' && username.charAt(i) >= '0') {
                flag2 = true;
            }
            if (flag1 && flag2) {
                break;
            }
        }
        if (flag1 && flag2) {
            System.out.println("规范符合");
        } else {
            System.out.println("规范不符合");
        }
        return flag1 && flag2;
    }

    private static boolean uniqueName(String name, ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(name)) {
                return false;
            }
        }
        return true;
    }


    private static void login(ArrayList<User> list) {
        //用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册
        //判断验证码是否正确，如不正确，重新输入
        //再判断用户名和密码是否正确，有3次机会
        System.out.println("请输入要登录的用户名");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        if (uniqueName(username, list)) {
            System.out.println("用户名未注册，请先注册");
            return;
        }
        System.out.println("请输入密码");
        String password = sc.nextLine();
        System.out.println("验证码为：");
        String rightIdentify = identifyPassword();
        System.out.println(rightIdentify);
        System.out.println("请输入验证码（不区分大小写）");
        String identifyPassword = sc.nextLine();
        for (int i = 0; ; i++) {
            if (loginByPassword(list, password, username) && identifyPassword.equalsIgnoreCase(rightIdentify)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("输入错误，请重新输入密码，您还有" + (2 - i) + "次机会");
                if (i == 2) {
                    System.out.println("登录失败，账号已锁定，请联系管理员");
                    return;
                }
                password = sc.nextLine();
            }
        }
        System.out.println("恭喜您成功登录");


    }

    private static String identifyPassword() {
        StringBuilder sb = new StringBuilder();//存储大小写字
        StringBuilder identifyPassword = new StringBuilder();//验证码

//	长度为5
//
//	由4位大写或者小写字母和1位数字组成，同一个字母可重复
//
//	数字可以出现在任意位置
        for (int i = 'a'; i <= 'z'; i++) {
            sb.append((char) i);
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            sb.append((char) i);
        }
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            identifyPassword.append(sb.charAt(r.nextInt(sb.length())));
        }
        identifyPassword.append((char) r.nextInt('0', '9' + 1));
        //打乱顺序
        int index = r.nextInt(identifyPassword.length() - 1);
        char ch = identifyPassword.charAt(index);
        identifyPassword.setCharAt(index, identifyPassword.charAt(identifyPassword.length() - 1));
        identifyPassword.setCharAt(identifyPassword.length() - 1, ch);
        return identifyPassword.toString();
    }

    private static boolean loginByPassword(ArrayList<User> list, String password, String username) {
        for (User user : list) {
            if (user.getPassword().equals(password) && user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

}

