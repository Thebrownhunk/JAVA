public class array {
    public static void main(String[] args) {

        //Arrays

        //An array is a collection of similar type of elements which has contiguous memory location.

        //Java array is an object which contains elements of a similar data type.
        //It is a data structure where we store similar elements.
        //We can store only a fixed set of elements in a Java array.
        //Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
        //The length of the array is established when the array is created and cannot be changed.

        //The syntax to declare an array is:

        //Syntax-1 :- datatype[] arrayname;
        //Ex :-
             //int[] marks1; //declaration
              //or
        //Syntax-2 :- datatype arrayname[];
        //Ex :-
             //int marks2[]; //declaration


        //The syntax to initialize an array is:

        //Syntax-1 :- datatype[] arrayname = new datatype[size];
        //Ex :-
             int[] marks3 = new int[5]; //declaration + memory allocation
             marks3[0] = 100;             // initialize
             marks3[1] = 90;              // initialize
             marks3[2] = 80;              // initialize
             marks3[3] = 70;              // initialize
             marks3[4] = 60;              // initialize
             System.out.println(marks3[1]);
              //or
        //Syntax-2 :- datatype arrayname[] = new datatype[size];
        //Ex :-
             int marks4[] = new int[5]; // declaration + memory allocation
             marks4[0] = 100;             // initialize
             marks4[1] = 90;              // initialize
             marks4[2] = 80;              // initialize
             marks4[3] = 70;              // initialize
             marks4[4] = 60;              // initialize
             System.out.println(marks4[1]);


        //The syntax to initialize an array with values is:
        
        //datatype[] arrayname = {value1, value2, value3, value4, ...};
        //Ex :-
             int[] marks5 = {20,30,40,50,60}; // declaration + memory allocation + initialize
             System.out.println(marks5[1]);
        
              //or
        //datatype arrayname[] = {value1, value2, value3, value4, ...};
        //Ex :-
             int marks6[] = {20,30,40,50,60}; // declaration + memory allocation + initialize
             System.out.println(marks6[1]);

        //The syntax to access an array element is:
        //arrayname[index];
        //Ex :- 
              int math = marks4[0];
              System.out.println(math);

        //The syntax to change an array element is:
        //arrayname[index] = newvalue;
        //Ex :- 
             marks4[0] = 98;
             System.out.println(marks4[0]);


        //The syntax to get the length of an array is:
        //arrayname.length;
        //Ex :- 
             System.out.println(marks6.length);

        //The syntax to iterate through an array using the for-each loop is:
        // syntax :- for (int i = 0; i < arrayname.length; i++) {
        //                  System.out.println(arrayname[i]);
        //            }
        //Ex :-
               String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
                for (int i = 0; i < cars1.length; i++) {
                System.out.println(cars1[i]);
                }

        //The syntax to iterate through an array using the for-each loop is:
        // syntax :- for (datatype element : arrayname) {
        //                System.out.println(element);
        //           }
        //Ex :-
                String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
                for (String i : cars2) {
                System.out.println(i);
                }

        //The syntax to sort an array is:
        //Arrays.sort(arrayname);

        //The syntax to search an element in an array is:
        //Arrays.binarySearch(arrayname, element);

        //The syntax to copy an array is:
        //Arrays.copyOf(arrayname, newlength);

        //The syntax to compare two arrays is:
        //Arrays.equals(arrayname1, arrayname2);

        //The syntax to fill an array is:
        //Arrays.fill(arrayname, value);
        
    }   
}
