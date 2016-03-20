// array
class Main
{ public static void main(String[] x)
  { 
    int[] intAr;     // this declares a reference to an array: intAr;
                     // no arrays yet exists
    intAr = new int[9]; // this creates an array of 9 integers,
                        // to which intAr points
    intAr[0] = 33;
    intAr[1] = -32;
    intAr[8] = 99991;

    System.out.printf("%d %d\n",intAr[2],intAr[8]);
  }
}

