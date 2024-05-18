package day15.pratice1;

public class Test {
    public static void main(String[] args) {
        bkAthlete bk = new bkAthlete("gyw",18);
        bkCoach bkc=new bkCoach("ztj",19);
        bk.work();
        bkc.work();
        System.out.println(bk.getAge()+"  "+bk.getName());
        System.out.println(bkc.getAge()+"  "+bkc.getName());

        ppAthlete pa=new ppAthlete("xxs",18);
        ppCoach pc=new ppCoach("yys",19);
        pc.work();
        pc.study();
        pa.work();
        pa.study();
    }
}
