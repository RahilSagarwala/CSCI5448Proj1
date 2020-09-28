package employees;

import java.util.List;

import animals.Animal;
import nameGenerator.nameGenerator;

public class ZooFoodServer extends ZooEmployee {
	
	public ZooFoodServer() {
	      super();
	      myName = "Name";
	   // TODO: add time element, so object is instantiated at beginning of day
	   }
	
	public ZooFoodServer(nameGenerator ng, List<Animal> a){
	      // Get unique name
	      myName = ng.getUniqueName(this.getType());
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
	      String output = this.getName() + " cleans the animal pens.";
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
	   private static String myType = "Zoo Keeper";

}
