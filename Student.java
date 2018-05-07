public class Student {

   // this instance variable is visible for any child class.
   public String name;

   // salary  variable is visible in Student class only.
   private int age;

   // The name variable is assigned in the constructor.
   public Student (String stuName) {
      name = stuName;
   }

   // The salary variable is assigned a value.
   public void setAge(int stuAge) {
      age = stuAge;
   }

   // This method prints the Student details.
   public void printStudent() {
      System.out.println("Name  : " + name );
      System.out.println("Age :" + age);
   }

   public static void main(String args[]) {
      Student student = new Student("John");
      student.setAge(23);
      student.printStudent();
   }
}