package basic;

public class LearnJavaBasic {

    public static void main(String[] args) {
        // control flow

        // if else condition () condition
        //int number1=25;
        String gender ="male";
        int age =18;



        if (age >=18 || age < 21){
            System.out.println("You can buy alcohols");
            if(age ==18){
                System.out.println("Age is 18 ");
                if(age!=18){
                    System.out.println(" The age is not correct");
                }else {
                    System.out.println("Ups !!! Something goes wrong on this ");
                }
            }

        }else{
            System.out.println(" You are not allowed to buy");
        }
}
}
