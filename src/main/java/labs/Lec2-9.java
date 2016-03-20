// Reading input from the keyboard
import java.util.*;

class Input
{ public static void main(String[] x)
  { Scanner s = new Scanner(System.in);
    int y = s.nextInt();
    
    if ((1+2) < y && y < 5)      // < > == <= >= !=
    { System.out.println("yes");
    }
    else
    { System.out.println("no");
    }
  }
}

