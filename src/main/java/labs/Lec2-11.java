
// bubble sort
public static void bsort(int[] i)
{ boolean exch = true;
 for (int j=0; j<i.length; j++)
    for (int k=1; k<(i.length -j); k++)
      if (i[k] < i[k-1])
      { int temp = i[k];   // exchange
        i[k] = i[k-1];
        i[k-1] = temp;
      }
  }
}
