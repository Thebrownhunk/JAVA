public class multidimessionalArray {
    public static void main(String[] args) {

        //Multidimensional Arrays

        //A multidimensional array is an array of arrays. 2-D array means that the array contains arrays as its elements.
        //It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.
        //Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
        //The length of the array is established when the array is created and cannot be changed.

        //The syntax to declare a 2-D array is:

        //Syntax-1 :- datatype[][] arrayname;
        //Ex :-
             //int[][] marks1; //declaration
              //or
        //Syntax-2 :- datatype arrayname[][];
        //Ex :-
             //int marks2[][]; //declaration


        //The syntax to initialize a 2-D array is:

        //Syntax-1 :- datatype[][] arrayname = new datatype[size];
        //Ex :-
        int[][] marks3 = new int[2][2]; //declaration + memory allocation
        marks3[0][0] = 100;             // initialize
        marks3[0][1] = 90;              // initialize       
        marks3[1][0] = 80;              // initialize
        marks3[1][1] = 70;              // initialize
        System.out.println(marks3[1][1]);
             //or
        //Syntax-2 :- datatype arrayname[][] = new datatype[size];
        //Ex :-   
        int marks4[][] = new int[2][2]; //declaration + memory allocation
        marks4[0][0] = 100;             // initialize   
        marks4[0][1] = 90;              // initialize
        marks4[1][0] = 80;              // initialize
        marks4[1][1] = 70;              // initialize
        System.out.println(marks4[0][1]);


        //The syntax to initialize an array with values is:

        //datatype[][] arrayname = {{value1,value2,value3...}, {value1,value2,value3...}...};
        //Ex :-
        int[][] marks5 = {{20,30,40,50,60}, {70,80,90,100,110}}; // declaration + memory allocation + initialize
        System.out.println(marks5[1][1]);
        
             //or   

        //datatype arrayname[][] = {{value1,value2,value3...}, {value1,value2,value3...}...};
        //Ex :-
        int marks6[][] = {{20,30,40,50,60}, {70,80,90,100,110}}; // declaration + memory allocation + initialize
        System.out.println(marks6[1][3]);


        //The syntax to change an array element is:

        //arrayname[row][column] = value;
        //Ex :-
        int[][] marks7 = { {1, 2, 3, 4}, {5, 6, 7} };
        marks7[1][2] = 9;
        System.out.println(marks7[1][2]);

        //The syntax to iterate through an array using the for loop is:

        //for (int i = 0; i < arrayname.length; i++) {
        //    for (int j = 0; j < arrayname[i].length; j++) {       
        //    }
        //}

        int[][] marks8 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < marks8.length; i++) {
            for (int j = 0; j < marks8[i].length; j++) {
                System.out.println(marks8[i][j]);
            }
        }

        //The syntax to iterate through an array using the for-each loop is:

        //for (datatype[] arrayname : arrayname) {
        //    for (datatype element : arrayname) {
        //    }
        //}

        int[][] marks9 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : marks9) {
            for (int mark : row) {
                System.out.println(mark);
            }
        }

        
        
    }
    
}
