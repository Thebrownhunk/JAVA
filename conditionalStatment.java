public class conditionalStatment {
    public static void main(String[] args) {
        //Conditional Statements
        //Conditional statements are used to perform different actions based on different conditions.
        //Java supports the following conditional statements:
            //if statement  
            //if...else statement  
            //if...else if....else statement  
            //switch statement 

        //if statement
        //The if statement executes some code if one condition is true
        int x = 20;
        if (x > 18) {
            System.out.println("x is greater than 18");
        }

        //if...else statement
        //The if...else statement executes some code if a condition is true and another code if that condition is false
        int y = 30;
        if (y > 40) {
            System.out.println("y is greater than 40");
        } else {
            System.out.println("y is less than 40");
        }

        //if...else if....else statement
        //The if...else if....else statement executes different codes for more than two conditions
        int z = 30;
        if (z > 40) {
            System.out.println("z is greater than 40");
        } else if (z == 40) {
            System.out.println("z is equal to 40");
        } else {
            System.out.println("z is less than 40");
        }

        //switch statement
        //The switch statement selects one of many code blocks to be executed
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
