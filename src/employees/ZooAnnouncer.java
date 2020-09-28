package employees;
import nameGenerator.nameGenerator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class ZooAnnouncer extends ZooEmployee implements PropertyChangeListener {

   public ZooAnnouncer() {
      super();
      myName = "Name";
   }

   public ZooAnnouncer(nameGenerator ng){
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
   @Override
   public void takeBreak() {
      String output = this.getName() + " takes no break.";
      System.out.println(output);
   }

   // Listens to the ZooKeeper's property changes (messages)
   public void propertyChange(PropertyChangeEvent e) {
      // propertyName can be retrieved by e.getPropertyName();
      // so that we can change the behavior according to the name
      ZooEmployeeActivity activity = (ZooEmployeeActivity) e.getNewValue();
      String first_sentence = "Hi, this is " + this.getName() + " the " + this.getType() + ". ";
      String second_sentence = activity.getName() + " the " + activity.getType() + " is about to " + activity.getAction();
      System.out.println(first_sentence + second_sentence);
   }

   // Private member variables
   // Private member variables are an example of encapsulation that hide implementation
   // details from the end user.
   private String myName;
   private static String myType = "Zoo Announcer";
}
