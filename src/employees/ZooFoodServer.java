package employees;

import java.beans.PropertyChangeEvent;
import java.util.List;
import clock.*;

import animals.Animal;
import nameGenerator.nameGenerator;

public class ZooFoodServer extends ZooEmployee {
	
	public ZooFoodServer() {
	      super();
	      myName = "Name";
	      clock = new ZooClock();
	   }
	
	public ZooFoodServer(nameGenerator ng, Clock c){
	      // Get unique name
	      myName = ng.getUniqueName(this.getType());
	      clock = c;
	      //clock.addObserver(this);
	   }
	
	 // public method to set the clock object
	   public void setClock(Clock c){
	      clock = c;
	   }
	   
	// Implement the update method of the observer interface allowing
	   // the ZooKeeper to be an instance of iObserver interface.
//	   @Override
//	   public void propertyChange(PropertyChangeEvent e) {
//	      if (e.getPropertyName() == "clock") {
//	         performTasks();
//	      }
//	   }
	   
	// Protected method to handle performing zoo food server tasks based on the time of day
	   // This is an example of the Pull implementation of Observer. When the zoo foos server
	   // gets notified that the clock has been updated, it reaches out to the clock object
	   // to get the updated attributes it cares about.
	   protected void performTasks() {
	      int currTime = clock.getCurrentTime();
	      int currDay = clock.getCurrentDay();
	      if (currTime == 7) {
	         arrivesAtZoo(currDay);
	      }

	      else if (currTime == 12) {
	    	 serveFood12();
	         makeFood12();
	      }
	      
	      else if (currTime == 14) {
		    	 clean();
		      }
	      else if (currTime == 17) {
	    	  serveFood5();
		      makeFood5();
	      }
	      
	      else if (currTime == 19) {
		    	 clean();
		      }
	      else if (currTime == 21) {
	         leaveZoo(currDay);
	      }
	   }
	
	 // This overridden method is an example of polymorphism
	   @Override
	   public String getName() {
	      return myName;
	   }
	   
	// This overridden method is an example of polymorphism
	   @Override
	   public String getType() {
	      return myType;
	   }

	   // This overridden method is an example of polymorphism
	   public void clean() {
	      String output = this.getName() + " cleans ";
	      System.out.println(output);
	   }
	   
	// TODO: integrate ZooClock for time
	   public void makeFood12() {
		      String output = this.getName() + " makes food at 12 o'clock.";
		      System.out.println(output);
		   }
		   
		   public void serveFood12() {
			      String output = this.getName() + "serves food at 12 o'clock.";
			      System.out.println(output);
			   }
		   
		   public void makeFood5() {
			      String output = this.getName() + " makes food at 5 o'clock.";
			      System.out.println(output);
			   }
			   
			   public void serveFood5() {
				      String output = this.getName() + " serves food at 5 o'clock.";
				      System.out.println(output);
				   }
			   
			   public void makeFoodAt(int x) {
				      String output = this.getName() + " makes food at" + x + " o'clock.";
				      System.out.println(output);
				   }
				   
				   public void serveFoodAt(int x) {
					      String output = this.getName() + " serves food at" + x + " o'clock.";
					      System.out.println(output);
					   }
	   
	   // Private member variables
	   // Private member variables are an example of encapsulation that hide implementation
	   // details from the end user.
	   private String myName;
	   private static String myType = "Zoo Food Server";
	   private Clock clock;

}
