/**
 * A driver program that creates several Person objects and prints their values.
 *
 * @author Timothy Urness & Claude 
 */
public class PersonDriver {

   /**
    * Creates a few Person objects and prints out their names and ages.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      Person p1 = new Person("Jim", 23);
      Person p2 = new Person("Anna", 32);
      Person p3 = new Person("Carl", 64);

      // Print using the getter methods
      System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge());
      System.out.println("Name: " + p2.getName() + ", Age: " + p2.getAge());
      System.out.println("Name: " + p3.getName() + ", Age: " + p3.getAge());

      // Change some values using the setter methods
      p1.setName("Jimmy");
      p2.setAge(33);

      // Print using toString()
      System.out.println();
      System.out.println("After changes:");
      System.out.println(p1);
      System.out.println(p2);
      System.out.println(p3);
   }
}
