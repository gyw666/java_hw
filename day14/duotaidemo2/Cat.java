package day14.duotaidemo2;

public class Cat extends Animal {
    public Cat(){
    }
    public Cat(int age, String color){
        super(age,color);
    }

    @Override
    public void eat(String food) {
        System.out.println(this.getAge()+"岁的"+this.getColor()+"色的猫眯着眼睛侧着头吃"+food);
    }

    public void catchMouse(){
        System.out.println("Cat catch mouse");
    }
}
