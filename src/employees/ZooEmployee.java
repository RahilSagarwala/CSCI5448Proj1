package employees;

import animals.*;

public abstract class ZooEmployee {

   //constructor
   public ZooEmployee() {
      super();
   }

   public abstract String getName();

   public abstract String getType();

   public void clean() {
      String output = this.getName() + " the " + this.getType() + " cleans.";
      System.out.println(output);
   }

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
