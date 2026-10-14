/**
 * This class models a Person with a name and an age.
 *
 * @author Timothy Urness & Claude 
 */
public class Person {

   private String name;
   private int age;

   /**
    * Constructs a Person with the given name and age.
    *
    * @param name the person's name
    * @param age the person's age in years
    */
   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }

   /**
    * Returns the person's name.
    *
    * @return the name of this person
    */
   public String getName() {
      return name;
   }

   /**
    * Changes the person's name.
    *
    * @param name the new name for this person
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * Returns the person's age.
    *
    * @return the age of this person in years
    */
   public int getAge() {
      return age;
   }

   /**
    * Changes the person's age.
    *
    * @param age the new age for this person in years
    */
   public void setAge(int age) {
      this.age = age;
   }

   /**
    * Returns a string representation of this person.
    *
    * @return a string containing the person's name and age
    */
   @Override
   public String toString() {
      return name + " (" + age + ")";
   }
}
