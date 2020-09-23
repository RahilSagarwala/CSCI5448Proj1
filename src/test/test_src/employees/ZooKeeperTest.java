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

   @Test
   void performTasks_Plays_With_Animals_At_0900() {
      // Arrange
      stubClock c = new stubClock();
      c.setCurrTime(9);
      mockZooKeeper mz = new mockZooKeeper(c);

      //Act
      mz.performTasks();

      //Assert
      assertTrue(mz.playCalled);
   }

   @Test
   void performTasks_Feeds_Animals_At_1100() {
      // Arrange
      stubClock c = new stubClock();
      c.setCurrTime(11);
      mockZooKeeper mz = new mockZooKeeper(c);

      //Act
      mz.performTasks();

      //Assert
      assertTrue(mz.feedCalled);
   }

   @Test
   void performTasks_Chases_Animals_At_1500() {
      // Arrange
      stubClock c = new stubClock();
      c.setCurrTime(15);
      mockZooKeeper mz = new mockZooKeeper(c);

      //Act
      mz.performTasks();

      //Assert
      assertTrue(mz.chaseCalled);
   }

   @Test
   void performTasks_Sleeps_Animals_At_1900() {
      // Arrange
      stubClock c = new stubClock();
      c.setCurrTime(19);
      mockZooKeeper mz = new mockZooKeeper(c);

      //Act
      mz.performTasks();

      //Assert
      assertTrue(mz.sleepCalled);
   }
}