// Arrays and loops

class Main
{ public static void main(String[] x)
  { 
    float[] fff;     // this declares a reference to an array: fff;
    fff = new float[30]; // this creates an array of 30 floats,
                         // to which fff points, the subscripts are
                         // 0,1,2,.... 29
    for (int k=0; k<30; k++)   // dynamic access (!) to array elements
    {
      fff[k] = k*1.5f;
    }
    System.out.printf("%10.2f \n",fff[10]);
  }
}

