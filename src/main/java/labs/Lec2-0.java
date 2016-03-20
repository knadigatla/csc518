// Classes (subclass vs superclasses)
import java.util.*;

class Main
{ public static void main(String[] x)
  { Person john = new Person("John",19800220,76);
    Person susan = new Person("Susan",19821123,66.5f);
    Person def = new Person();
    Student mike = new Student("Mike",19900125,61,573843);
    john.print();
    susan.print();
    def.print();
    mike.print();
  }
}

class Person
{ private String name;
  private long birthdate;
  private float weight;

  public Person()
  { name = "noname";
    birthdate = 0;
    weight = 0;
  }
  public Person(String name, long birthdate, float weight)
  { this.name = name;
    this.birthdate = birthdate;
    this.weight = weight;
  }
  public void print()
  { System.out.printf("Person\n name: %s  birthdate: %d, weight: %f\n",
      name,birthdate,weight);
  }
}

class Student extends Person
{ private long studId;
  public Student(String name, long birthdate, float weight, long studId)
  { super(name,birthdate,weight);
    this.studId = studId;
  }
  public void print()
  { super.print();
    System.out.printf(" studId: %d\n",studId);
  }
}

