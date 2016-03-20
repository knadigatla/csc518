     import java.util.*;
         class StringTokenizerDemo 
        { 
              public static void main(String[] args)
              { 
                  String str = "hello,java,delphi,asp,php";
                  StringTokenizer st=new StringTokenizer(str,",");
                  while(st.hasMoreTokens()) { 
                      System.out.println(st.nextToken());
                  }
              }
          } 
