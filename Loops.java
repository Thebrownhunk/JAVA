public class Loops {
    public static void main(String[] args) {
        //Loops
        //Loops can execute a block of code as long as a specified condition is reached.
        //Loops are handy because they save time, reduce errors, and they make code more readable.
        //Java supports the following types of loops:
            //for loop
            //while loop
            //do...while loop
            //for-each loop

        //for loop
        //When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println("\n");

        //while loop
        //The while loop loops through a block of code as long as a specified condition is true
        int j = 0;
        while (j < 5) {
            System.out.print(j);
            System.out.print(",");
            j++;
        }
        System.out.println("\n");

        //do...while loop
        //The do...while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true
        int k = 0;
        do {
            System.out.print(k);
            System.out.print(",");
            k++;
        } while (k < 5);
        System.out.println("\n");

        //for-each loop
        //There is also a "for-each" loop, which is used exclusively to loop through elements in an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String l : cars) {
            System.out.print(l);
            System.out.print(",");
        }

        //break statement
        //You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.  
        //The break statement can also be used to jump out of a loop
        System.out.println("\n");
        for (int m = 0; m < 10; m++) {
            if (m == 4) {
                break;
            }
            System.out.print(m);
            System.out.print(",");
        }
        System.out.println("\n");

        //continue statement
        //The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop
        for (int n = 0; n < 10; n++) {
            if (n == 4) {
                continue;
            }
            System.out.print(n);
            System.out.print(",");
        }   

        
    }
}
