package employees;

import animals.*;

public class ZooKeeper extends ZooEmployee {
	
	public ZooKeeper() {
	      super();
	   }
	
	
	   @Override
	   public String getName() {
	      return "Zoo Keeper";
	   }
	   
	   @Override
	   public void clean() {
	      String output = "ZooKeeper cleans.";
	      System.out.println(output);
	   }
	   
	   @Override
	   public void takeBreak() {
		   String output = "ZooKeeper takes break.";
		   System.out.println(output);
		   }
	   
	   @Override
	   public void arrivesAtZoo() {
		   String output = "ZooKeeper arrives at the zoo.";
	      System.out.println(output);
	   }
	   
	   @Override
	   public void leaveZoo() {
		  String output = "ZooKeeper leaves the zoo.";
	      System.out.println(output);
	   }
	   
	   public void playWithAnimal() {
			  String output = "ZooKeeper plays with" + "animal" + "and"
					  + "animal" + "makes Noise.";
		      System.out.println(output);
		   }
	   
	   public void chaseAnimal() {
		   String output = "ZooKeeper chases" + "animal" + "and"
					  + "animal" + "roams.";
		      System.out.println(output);
		   }
	   
	   public void feedAnimal() {
		   String output = "ZooKeeper feeds" + "animal" + "and"
					  + "animal" + "eats.";
		      System.out.println(output);
		   }
	   public void wakeUpAnimal() {
		   String output = "ZooKeeper wakes up" + "animal" + "and"
					  + "animal" + "wakes up.";
		      System.out.println(output);
		   }
	   
	   public void putAnimalToSleep() {
		   String output = "ZooKeeper puts" + "animal" + "to sleep and"
					  + "animal" + "sleeps.";
		      System.out.println(output);
		   }


	
}
