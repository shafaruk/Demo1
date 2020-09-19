package basic;

public class LearnConstructor {
    String name;
    int age;

    public LearnConstructor(){
        System.out.println("This is the default constructor");

    }
    public LearnConstructor(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("My name is "+ name + " and my age is "+age);

    }

    public static void main(String[] args) {
        LearnConstructor obj= new LearnConstructor();
        LearnConstructor obj1=new LearnConstructor("faruk",25);
    }
}
