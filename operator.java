public class operator {
    public static void main(String[] args) {
        
        //Operators
        //Operators are used to perform operations on variables and values.
        //int x = 100 + 50;

        //Types of operators
        //1. Arithmetic operators
        //2. Assignment operators
        //3. Comparison operators
        //4. Logical operators
        //5. Bitwise operators
        //6. Ternary operators
        //7. Instance of operators

        int x = 5;
        int y = 3;

        System.out.println("Arithmetic operators");
        // operator                                 name
         System.out.println( x + y);             // Addition
         System.out.println( x - y);             // Subtraction
         System.out.println( x * y);             // Multiplication
         System.out.println( x / y);             // Division
         System.out.println( x % y);             // Modulus
         System.out.println( x ++);              // Increment
         System.out.println( x --);              // Decrement

        System.out.println("Assignment operators");
         // operator                                 meaning
         System.out.println( x = y);              //  x = y
         System.out.println( x += y);             //  x = x + y
         System.out.println( x -= y);             //  x = x - y
         System.out.println( x *= y);             //  x = x * y
         System.out.println( x /= y);             //  x = x / y
         System.out.println( x %= y);             //  x = x % y
         System.out.println( x &= y);             //  x = x & y
         System.out.println( x |= y);             //  x = x | y
         System.out.println( x ^= y);             //  x = x ^ y             
         System.out.println( x >>= y);            //  x = x >> y
         System.out.println( x <<= y);            //  x = x << y
        
        System.out.println("Comparison operators");
        // operator                                 meaning
         System.out.println( x == y);             // Equal to
         System.out.println( x != y);             // Not equal to
         System.out.println( x > y);              // Greater than
         System.out.println( x < y);              // Less than
         System.out.println( x >= y);             // Greater than or equal to
         System.out.println( x <= y);             // Less than or equal to

        System.out.println("Logical operators");
        // operator                                 name
         System.out.println( x > 3 && x < 10);    // Logical and
         System.out.println( x < 3 || x < 4);     // Logical or
         System.out.println( !(x > 3 && x < 10)); // Logical not

        System.out.println("Bitwise operators");
        // operator                                 name
         System.out.println( x & y);              // Bitwise and
         System.out.println( x | y);              // Bitwise or
         System.out.println( x ^ y);              // Bitwise xor
         System.out.println( ~x);                 // Bitwise compliment
         System.out.println( x << 2);             // Left shift
         System.out.println( x >> 2);             // Right shift

        System.out.println("Ternary operators");
        // operator                                 name
         System.out.println( x > y ? x : y);      // Ternary operator
        
        
        System.out.println("Instance of operators");
        String myText = "Hello"; 
        // operator                                 
         System.out.println("text is String: " + (myText instanceof String)); // Instance of operator
    }
}
