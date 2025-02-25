import java.lang.String;
public class stringggg {
    public static void main(String[] args) {
        
        //Strings
        //A String variable contains a collection of characters surrounded by double quotes
        //Strings are used for storing text.
        //A String in Java is actually an object, which contain methods that can perform certain operations on strings.

        //String name = new String("ankit");  
        String name = "ankit";
        System.out.println("My name is " + name);

        //String methods
        //string methods operate on java strings they can be used to find length of the string,convert to lower case,upper case,etc

         int value = name.length(); //length() method returns the length of a string
         System.out.println("Length of the string is " + value);

         String lowercasename = name.toLowerCase(); //toLowerCase() method converts the string to lower case
         System.out.println("Lower case of the string is " + lowercasename);

         String uppercasename = name.toUpperCase(); //toUpperCase() method converts the string to upper case
         System.out.println("Upper case of the string is " + uppercasename);

         String nontrimmedname = "    ankit    ";
         String trimmedname = nontrimmedname.trim(); //trim() method removes the leading and trailing white spaces
         System.out.println("Trimmed string is " + trimmedname);

         String substr = name.substring(2); //substring() method returns a new string that is a substring of this string
         System.out.println("Substring is " + substr);
         String substr2 = name.substring(1,4);
         System.out.println("Substring second method is " + substr2);

         String replace = name.replace('t','x'); //replace() method replaces all occurrences of a character with another character
         System.out.println("Replaced string is " + replace);
         String replace2 = name.replace("kit","xxx");
         System.out.println("Replaced string second method is " + replace2);

         int index = name.indexOf('k'); //indexOf() method returns the index of the first occurrence of the specified character
         System.out.println("Index of k is " + index);
         int index2 = name.indexOf("kit");
         System.out.println("Index of kit is " + index2);

         String concat = name.concat(" is my name"); //concat() method appends a string to the end of another string
         System.out.println("Concatenated string is " + concat);
         
         boolean startswith = name.startsWith("an"); //startsWith() method checks whether a string starts with a specified string
         System.out.println("String starts with an " + startswith);

         boolean endswith = name.endsWith("i"); //endsWith() method checks whether a string ends with a specified string
         System.out.println("String ends with it " + endswith);

         char charat = name.charAt(2); //charAt() method returns the character at the specified index
         System.out.println("Character at index 2 is " + charat);
   
    }
}
