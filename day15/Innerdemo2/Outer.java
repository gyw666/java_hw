package day15.Innerdemo2;

public class Outer {
    private int a=10;

    public int getA(){
        return a;
    }

    class Inner{
        private int a=20;

        public void show(){
            int a=30;


            System.out.println(a);
            System.out.println(this.a);
            //获取外部类对象的地址值
            System.out.println(Outer.this.a);
        }
    }
}
