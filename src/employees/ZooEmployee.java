package employees;

// This is an example of an abstract class. Not all of its methods are implemented
// so an instance of ZooEmployee can not be created.
public abstract class ZooEmployee {

   //constructor
   public ZooEmployee() {
      super();
   }

   public abstract String getName();

   public abstract String getType();

   public void takeBreak() {
      String output = this.getName() + " the " + this.getType() + " takes break.";
      System.out.println(output);
   }

   public void arrivesAtZoo(int day) {
      String output = this.getName() + " the " + this.getType() + " arrives at the zoo on day " + day + ".";
      System.out.println(output);
   }

   public void leaveZoo(int day) {
      String output = this.getName() + " the " + this.getType() + " leaves the zoo on day " + day + ".";
      System.out.println(output);
   }

}
