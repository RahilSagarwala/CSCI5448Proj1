package employees;
import clock.Clock;
import clock.ZooClock;
import nameGenerator.nameGenerator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class ZooAnnouncer extends ZooEmployee implements PropertyChangeListener {

   public ZooAnnouncer() {
      super();
      myName = "Name";
      myClock = new ZooClock();
   }

   public ZooAnnouncer(nameGenerator ng, Clock c){
      // Get unique name
      myName = ng.getUniqueName(this.getType());
      myClock = c;
      myClock.addObserver(this);
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
   @Override
   public void takeBreak() {
      String output = this.getName() + " takes no break.";
      System.out.println(output);
   }

   // Listens to the ZooKeeper's property changes (messages)
   public void propertyChange(PropertyChangeEvent e) {
      // propertyName can be retrieved by e.getPropertyName();
      if (e.getPropertyName() == "zookeeper") {
         // so that we can change the behavior according to the name
         ZooEmployeeActivity activity = (ZooEmployeeActivity) e.getNewValue();
         String first_sentence = "Hi, this is " + this.getName() + " the " + this.getType() + ". ";
         String second_sentence = activity.getName() + " the " + activity.getType() + " is about to " + activity.getAction();
         System.out.println(first_sentence + second_sentence);
      }
      else if (e.getPropertyName() == "clock"){
         clockTasks();
      }
   }

   public void setClock(Clock c){
      myClock = c;
   }

   private void clockTasks(){
      int currTime = myClock.getCurrentTime();
      int currDay = myClock.getCurrentDay();

      if(currTime == 7){
         arrivesAtZoo(currDay);
      }
      else if(currTime == 8){
         zooOpening();
      }
      else if (currTime == 20){
         zooClosing();
      }
      else if (currTime == 21){
         leaveZoo(currDay);
      }
   }

   private void zooOpening(){
      String output = "Hi, this is " + myName + " the " + myType +
            ". The Zoo is now open!";
      System.out.println(output);
   }

   private void zooClosing(){
      String output = "Hi, this is " + myName + " the " + myType +
            ". The Zoo is now closed.";
      System.out.println(output);
   }

   // Private member variables
   // Private member variables are an example of encapsulation that hide implementation
   // details from the end user.
   private String myName;
   private static String myType = "Zoo Announcer";
   private Clock myClock;
}
