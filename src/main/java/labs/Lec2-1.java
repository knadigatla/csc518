// Classes (override and overload)

import java.util.*;

class Main
{ public static void main(String[] x)
    {
	//Person john = new Person("John",19800220,76);
	//Person susan = new Person("Susan",19821123,66.5f);
	//Person def = new Person();
	//Student mike = new Student("Mike",19900125,61,573843);
	//john.print();
	//susan.print();
	//def.print();
	//mike.print();
	Person lee = new Student("Lee",55555,22,111);
	//Student lee = new Student("Lee",55555,22,111);
	//Student lee = (Student) new Person("Lee",55555,22);
	//Person lee = new Person("Lee",55555,22);

	lee.printwalk();
  }
}

//superclass
class Person
{ private String name;
  private long birthdate;
  private float weight;

   private void pri_walk( ) {
       System.out.println("Person pri_walk");}
   protected void pro_walk( ) {
       System.out.println("Person pri_walk"); }
   public void pub_walk( ) {
       System.out.println("Person pri_walk"); }
    
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
    public final void printwalk()
    {
	pri_walk( );
	pro_walk( );
	pub_walk( );
    }
}

// subclass
class Student extends Person
{ private long studId;
  public Student(String name, long birthdate, float weight, long studId)
  { super(name,birthdate,weight);
    this.studId = studId;
  }
   public void pri_walk( ) {
       System.out.println("Student pri_walk"); }
   public void pro_walk( ) {
       System.out.println("Student pri_walk"); }
   public void pub_walk( ) {
       System.out.println("Student pri_walk"); }
    
  public void print()
  { super.print();
    System.out.printf(" studId: %d\n",studId);
  }
}

