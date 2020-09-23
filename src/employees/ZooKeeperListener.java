package employees;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;


public class ZooKeeperListener implements PropertyChangeListener {

   public ZooKeeperListener() {
      super();
      zooEmployee = null;
   }

   public ZooKeeperListener(ZooEmployee zooEmployee){
      this.zooEmployee = zooEmployee;
   }

   public void propertyChange(PropertyChangeEvent e) {
      // propertyName can be retrieved by e.getPropertyName();
      // so that we can change the behavior according to the name
      String message = e.getNewValue().toString();
      String output = "Hi, this is the " + zooEmployee.getType() + ". " + message;
      System.out.println(output);
   }

   private ZooEmployee zooEmployee;
}
