public class Employee {

   private String myName;
   private double mySalary;

   public Employee(String name, double salary) {
      myName = name;
      mySalary = salary;
   }

   public String getName() {
      return myName;
   }

   public double getSalary() {
      return mySalary;
   }

   public void raiseSalary(int percent) {
      mySalary = mySalary +
         percent * 0.1 * mySalary; // El salari ha pasat a 0.1*mySalary
   }

   public void setSalary(double salary) {
      mySalary = salary;
   }

   public String toString() {
      return "Name: " + getName() +
             ", Salary: " + getSalary();
   }
}