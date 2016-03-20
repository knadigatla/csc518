import java.util.Scanner;

/**
 * Created by kiran on 3/20/16.
 */
public class Largest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[] = new int[10];
        int i=0;
        for (i=0; i <10; i++) {
            num[i] = in.nextInt();
            if(num[i] == -1){
                i=10;
            }
        }

        int largest =0;
        i =0;
        while (i < 10) {
            if(num[i] > largest){
                largest = num[i];
            }
            i++;
        }

        System.out.println("The largest Number is: "+ largest);

    }
}
