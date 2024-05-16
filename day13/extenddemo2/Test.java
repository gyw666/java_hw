package day13.extenddemo2;

public class Test {
    public static void main(String[] args) {
        Husky husky=new Husky();
        husky.eat();
        husky.drink();
        husky.destroy();
        husky.lookHome();
        System.out.println("------------以上是哈士奇---------");
        chineseDog cd=new chineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();
        System.out.println("------------以上是中华田园犬---------");
        Shapi sp=new Shapi();
        sp.eat();
        sp.drink();
        sp.lookHome();
    }
}
