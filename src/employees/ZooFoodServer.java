package employees;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;
import clock.*;

import animals.Animal;
import nameGenerator.nameGenerator;
import observer.iSubject;

public class ZooFoodServer extends ZooEmployee implements iSubject, PropertyChangeListener {

   public ZooFoodServer() {
      super();
      myName = "Name";
      clock = new ZooClock();
      subject = new PropertyChangeSupport(this);
   }

   public ZooFoodServer(nameGenerator ng, Clock c){
      // Get unique name
      myName = ng.getUniqueName(this.getType());
      clock = c;
      clock.addObserver(this);
      subject = new PropertyChangeSupport(this);
   }

   // public method to set the clock object
   public void setClock(Clock c){
      clock = c;
   }

   // Overridden method to make the food server observable
   @Override
   public void addObserver(PropertyChangeListener o) {
      subject.addPropertyChangeListener(o);
   }

   // Overridden method to make the food server observable
   @Override
   public void removeObserver(PropertyChangeListener o) {
      subject.removePropertyChangeListener(o);
   }

   // Overridden method to make the food server observable
   @Override
   public void notifyObservers(Object oldObj, Object newObj) {
      subject.firePropertyChange("food server", oldObj, newObj);
   }

   // Implement the update method of the observer interface allowing
   // the ZooKeeper to be an instance of iObserver interface.
	@Override
	public void propertyChange(PropertyChangeEvent e) {
	   if (e.getPropertyName().equals("clock")) {
	      performTasks();
	   }
	}

   // Protected method to handle performing zoo food server tasks based on the time of day
   // This is an example of the Pull implementation of Observer. When the zoo food server
   // gets notified that the clock has been updated, it reaches out to the clock object
   // to get the updated attributes it cares about.
   protected void performTasks() {
      int currTime = clock.getCurrentTime();
      int currDay = clock.getCurrentDay();
      if (currTime == 7) {
         arrivesAtZoo(currDay);
      }
      else if (currTime == 12) {
         makeFoodAt(currTime);
         serveFoodAt(currTime);
      }
      else if (currTime == 14) {
         clean();
      }
      else if (currTime == 17) {
         makeFoodAt(currTime);
         serveFoodAt(currTime);
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
      String newAction = "clean";
      // Notify observers of the change in state
      notifyObservers(action, newAction);

      String output = myName + " the " + myType + " cleans the kitchen.";
      System.out.println(output);
      action = newAction;
   }

   public void makeFoodAt(int t) {
      String meal = "dinner";
      if (t == 12) { meal = "lunch"; }

      String newAction = "prepare " + meal;
      // Notify observers of the change in state
      notifyObservers(action, newAction);

      String output = myName + " the " + myType + " prepares " + meal + " at " + t + "00 o'clock.";
      System.out.println(output);
      action = newAction;
   }

   public void serveFoodAt(int t) {
      String meal = "dinner";
      if (t == 12) { meal = "lunch"; }

      String newAction = "serve " + meal;
      // Notify observers of the change in state
      notifyObservers(action, newAction);

      String output = myName + " the " + myType + " serves " + meal + " at " + t + "00 o'clock.";
      System.out.println(output);
      action = newAction;
   }

   // Private member variables
   // Private member variables are an example of encapsulation that hide implementation
   // details from the end user.
   private String myName;
   private static String myType = "Zoo Food Server";
   private Clock clock;
   private PropertyChangeSupport subject;
   private String action;

}
