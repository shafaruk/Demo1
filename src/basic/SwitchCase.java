package basic;

public class SwitchCase {
    public static void main(String[] args) {
        // switch(zCondition) { case number: statements break}

        int month=4;
        String monthName;

        switch(month){
            case 1: monthName=" January";
                break;
            case 2: monthName=" February";
                break;
            case 3: monthName =" March";
                break;
            case 4: monthName ="April";
                break;
            default : monthName =" Ups! Unknown Data";
                break;
        }
        System.out.println(monthName);
    }
}
