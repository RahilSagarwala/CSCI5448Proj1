package employees;
import nameGenerator.nameGenerator;
import java.beans.PropertyChangeListener;


public class ZooAnnouncer extends ZooEmployee {

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

   // Private member variables
   // Private member variables are an example of encapsulation that hide implementation
   // details from the end user.
   private String myName;
   private static String myType = "Zoo Announcer";
   // Listener implements an Observer class to listen to Observable (ZooKeeper)
   private PropertyChangeListener zooKeeperListener = new ZooKeeperListener(this);
}
