package labs;//  java.lang.String.

import java.lang.*;

class StringDemo {

  public static void main(String[] args) {
  
    String str = "test string";
    // prints length of string
    System.out.println("length of string =  " + str.length());
    // checks if the string is empty or not
    System.out.println("is this string empty? = " + str.isEmpty());
    
    // empty string
    str = "";
    // prints length of string
    System.out.println("length of string =  " + str.length());
    // checks if the string is empty or not
    System.out.println("is this string empty? = " + str.isEmpty());


    //2.  java.lang.String.contains() 
    String str1 = "test string", str2 = "a - b";

    CharSequence cs1 = "test";
    
    // string contains the specified sequence of char values
    boolean retval = str1.contains(cs1);
    System.out.println("Method returns : " + retval);
    
    // string does not contain the specified sequence of char value
    retval = str2.contains("-");   
    System.out.println("Methods returns: " + retval);

    String str3 = "word1 word2, word3, word4.word5";
    String delimiters = "\\s+|,\\s*|\\.\\s*";

    
    // 3. java.lang.String.split(String regex) analyzing the string 
    String[] tokensVal = str.split(delimiters);

    // prints the number of tokens
    System.out.println("Count of tokens = " + tokensVal.length);
    
    for(String token : tokensVal) {
       System.out.print(token);
    } 
  }
}
