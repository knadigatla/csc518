import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by kiran on 3/20/16.
 */
public class Test {

    static int x;
    public static void main(String[] args) {
        String str3 = "word1 word2, word3, word4.word5";
        String delimiters = "\\s+|,\\s*|\\.\\s*";


        // 3. java.lang.String.split(String regex) analyzing the string
        String[] tokensVal = str3.split(delimiters);
        System.out.println(Arrays.toString(tokensVal));


        System.out.printf("********");

//        int a[][] = new int[3][];
//        a[1] = new int[]{1,2,3};
//        a[2] = new int[]{4,5};
////        System.out.println(a[1][1]);
////
////        System.out.println(a instanceof java.lang.Object);


//        int a[] = {1,2,053,4};
//        int b[][] = {{1,2,4},{2,2,1},{0,43,2}};
//
//        System.out.println(a[3] ==b[0][2]);
//        System.out.println(a[2]+" "+b[2][1]);
//        System.out.println(" " +(a[2] ==b[2][1]));

         int name=2 ;
        x=1;
        switch (name) {
            case 0: x+=2;
            case 1: x-=2;break;
            case 2: x--;
            default : x++;break;
        }


        System.out.println(x);


    }



    interface IntYou {
        void foo();
        void bar(int x);
    }


}
