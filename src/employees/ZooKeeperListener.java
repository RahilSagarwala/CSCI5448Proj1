package employees;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/* ZooKeeperListener is an implementation of the observer pattern.
 * It listens to the ZooKeeper's messages.
 * It announces itself and also prints messages received from ZooKeeper.
 * The class was separated from ZooAnnouncer since this is an implementation
 * and ZooAnnouncer needs to extend ZooEmployee class.
 */
public class ZooKeeperListener implements PropertyChangeListener {

   public ZooKeeperListener(ZooEmployee zooEmployee) {
      super();
      this.zooEmployee = zooEmployee;
   }

   // Listens to the ZooKeeper's property changes (messages)
   public void propertyChange(PropertyChangeEvent e) {
      // propertyName can be retrieved by e.getPropertyName();
      // so that we can change the behavior according to the name
      String message = e.getNewValue().toString();
      String output = "Hi, this is the " + zooEmployee.getType() + ". " + message;
      System.out.println(output);
   }

   private ZooEmployee zooEmployee;
}
