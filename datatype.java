public class datatype {
    public static void main(String[] args){

        //Datatype
        //Data types are divided into two groups:
        //Primitive data types - includes byte, short, int, long, float, double, boolean and char
        //Non-primitive data types - such as String, Arrays and Classes.

        //Check Data type
        String text = "Hello";
        System.out.println("text type: " + ((Object)text).getClass().getName());  // 1st Method
        System.out.println("text type: " + text.getClass().getName());            // 2nd Method

        //Primitive data types
        int myintNum = 5;               // Integer (whole number)
        System.out.println(myintNum);
        System.out.println("num type: " + ((Object)myintNum).getClass().getName()); 

        float myFloatNum = 5.99f;       // Floating point number
        System.out.println(myFloatNum);
        System.out.println("num type: " + ((Object)myFloatNum).getClass().getName());

        char myLetter = 'D';            // Character
        System.out.println(myLetter);
        System.out.println("text type: " + ((Object)myLetter).getClass().getName());

        boolean myBool = true;          // Boolean
        System.out.println(myBool);
        System.out.println("text type: " + ((Object)myBool).getClass().getName());

        String myText = "Hello";        // String
        System.out.println(myText);
        System.out.println("text type: " + ((Object)myText).getClass().getName());
        System.out.println("text is String: " + (myText instanceof String));

        byte myByteNum = 100;           // Byte
        System.out.println(myByteNum);
        System.out.println("num type: " + ((Object)myByteNum).getClass().getName());
         
        short myShortNum = 5000;        // short
        System.out.println(myShortNum);
        System.out.println("num type: " + ((Object)myShortNum).getClass().getName());

        double mydoubleNum = 19.99d;    // double
        System.out.println(mydoubleNum);
        System.out.println("num type: " + ((Object)mydoubleNum).getClass().getName());

        long myLongNum = 15000000000L;  // long
        System.out.println(myLongNum);
        System.out.println("num type: " + ((Object)myLongNum).getClass().getName());


        // Data Type	Description
        // byte      	Stores whole numbers from -128 to 127
        // short	    Stores whole numbers from -32,768 to 32,767
        // int	        Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long	        Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // double   	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        // boolean	    Stores true or false values
        // char	        Stores a single character/letter or ASCII values
    }
}
