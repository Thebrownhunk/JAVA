public class typeCasting {
    public static void main(String[] args){

        // Java Type Casting
        // Type casting is when you assign a value of one primitive data type to another type.

        // In Java, there are two types of casting:

        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        
        // Widening Casting:-
        int myInt1 = 9;
        double myDouble1 = myInt1; // Automatic casting: int to double
    
        System.out.println(myInt1);      // Outputs 9
        System.out.println(myDouble1);   // Outputs 9.0

        // Narrowing Casting:-
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9    
    }
}
