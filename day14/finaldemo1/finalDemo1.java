package day14.finaldemo1;

public class finalDemo1 {
    /*
    final修饰方法:
        表明该方法是最终方法,无能被重写
    final修饰类:
        表明该类是最终类,不能被继承
    final修饰变量:
        叫做常量,只能别赋值一次
        单个单词全部大写,多个单词全部大写,中间用下划线隔开
     */
    public static void main(String[] args) {
        final int a=10;   //值不能改变
        System.out.println(a);
    }
}

final class fu {       //final修饰的类不能被继承
    public final void show() {   //被final修饰的方法不能被子类重写
        System.out.println("父类的show方法");
    }
}

//class zi extends fu{
//    @Override
//    public void show() {
//        System.out.println("子类的show方法");
//    }
//}
