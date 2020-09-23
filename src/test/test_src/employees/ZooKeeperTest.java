package employees;

import clock.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooKeeperTest {

   @Test
   void performTasks_Wakes_Animals_At_0800() {
      // Arrange
      stubClock c = new stubClock();
      c.setCurrTime(8);
      mockZooKeeper mz = new mockZooKeeper(c);

      //Act
      mz.performTasks();

      //Assert
      assertTrue(mz.wakeCalled);
   }
}