package hw10;

public class hw22 {
    public static void main(String[] args) {

    }
}

class MyString1{
    private  String str;
    public MyString1(char[] chars){
        this.str=new String(chars);
    }

    public MyString1() {
    }

    public char charAt(int index){
        return str.charAt(index);
    }
    public int length(){
        return str.length();
    }
    public MyString1 substring(int begin,int end){
        return new MyString1(str.substring(begin,end).toCharArray());
    }
    public MyString1 toLowerCase(){
        return new MyString1(str.toLowerCase().toCharArray());
    }

    public boolean equals(MyString1 s){
        return s.getStr().equals(this.str);
    }

    public static MyString1 valueOf(int i){
        String s=""+i;
        return new MyString1(s.toCharArray());
    }

    public String getStr(){
        return str;
    }

}
