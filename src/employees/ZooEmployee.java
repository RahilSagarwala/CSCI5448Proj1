package employees;

public abstract class ZooEmployee {

   //constructor
   public ZooEmployee() {
      super();
   }

   public abstract String getName();

   public void clean() {
      String output = this.getName() + "cleans.";
      System.out.println(output);
   }

   public void takeBreak() {
      String output = this.getName() + "takes break.";
      System.out.println(output);
   }

   public void arrivesAtZoo() {
      String output = this.getName() + "arrives at the zoo.";
      System.out.println(output);
   }

   public void leaveZoo() {
      String output = this.getName() + "leaves the zoo.";
      System.out.println(output);
   }

}
