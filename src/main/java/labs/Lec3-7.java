// in an array, printing the array; create a package, use the package
import people.*;

class Main
{ public static void main(String[] x)
  { Person[] studAr = new Person[5];  // what can I put in this array?
    studAr[0] = new Student("Kevin",19870311,72,700562);
    studAr[1] = new Student("mikel",19880315,72,75262);
    studAr[2] = new Person("Andy",19660311,72);
    studAr[3] = new GradStudent("Andy1",19660311,72,704232,"Robotics");
    studAr[4] = new PhDStudent("Phil",19660311,72,704542,"Robotics", "Ontology");
     for (int h=0; h<studAr.length; h++)
       studAr[h].print();
  }
}

