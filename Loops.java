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
    }
}
