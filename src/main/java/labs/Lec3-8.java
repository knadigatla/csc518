// use Interface to find a biggest one
import java.util.Random;

class Main
{ public static void main(String[] x)
  { Person[] persAr = new Person[4];
    persAr[0] = new Person("John",19800220,76);
    persAr[1] = new Person("Susan",19821123,66.5f);
    persAr[2] = new Person("James",19780215,76);
    persAr[3] = new Person("Gilbert",19830503,66.5f);

    int m = findBiggest(persAr);
    System.out.printf("biggest %d\n",m);
  }

// This method is written so that it can find the biggest 
// in an array of Comparab
  static int findBiggest(Comparab[] c)
  { int loc = 0;
    for (int k=0; k<c.length; k++)
      if (c[loc].smaller(c[k]))  // particular syntax is unimportant
        loc = k; 
    return loc;
  } 
}

