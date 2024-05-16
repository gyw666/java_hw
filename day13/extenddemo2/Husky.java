package day13.extenddemo2;

public class Husky extends Dog{
    @Override
    public void eat() {
        System.out.println("吃狗粮");
    }
    public void destroy(){
        System.out.println("拆家");
    }
}
