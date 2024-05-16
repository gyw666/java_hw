package day14.duotaidemo2;

public class Dog extends Animal{
    public Dog() {
    }
    public Dog(int age,String color){
        super(age,color);
    }

    @Override
    public void eat(String food) {
        System.out.println(this.getAge()+"岁的"+this.getColor()+"色的狗两只前腿死死的抱着"+food+"猛吃");
    }

    public void lookHome(){
        System.out.println("Dog is looking home");
    }
}
