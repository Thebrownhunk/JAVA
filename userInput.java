import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {

        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a number:-");
        int number = sc.nextInt();  // Read a number
        
        // Consume the newline character left by nextInt
        sc.nextLine();  // This will prevent problems when reading the next line
        
        System.out.print("enter a string:-");
        String text = sc.nextLine();  // Read a string

        System.out.println("You entered number: " + number);
        System.out.println("You entered string: " + text);

        sc.close();

        // System.out.print("enter number 1:-");
        // int a = sc.nextInt();
        // System.out.print("enter number 2:-");
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println("the sum of these number is :"+sum);
    }
}
