package employees;

import clock.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooKeeperTest {

   @Test
   void performTasksWakesAnimalsAt0900() {
      // Arrange
      stubClock c = new stubClock();
      c.setCurrTime(9);
      mockZooKeeper mz = new mockZooKeeper(c);

      //Act
      mz.performTasks();

      //Assert
      assertTrue(mz.wakeCalled);
   }

   @Test
   void performTasksPlaysWithAnimalsAt1000() {
      // Arrange
      stubClock c = new stubClock();
      c.setCurrTime(10);
      mockZooKeeper mz = new mockZooKeeper(c);

      //Act
      mz.performTasks();

      //Assert
      assertTrue(mz.playCalled);
   }

   @Test
   void performTasksFeedsAnimalsAt1100() {
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
   void performTasksChasesAnimalsAt1500() {
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
   void performTasksSleepsAnimalsAt1900() {
      // Arrange
      stubClock c = new stubClock();
      c.setCurrTime(19);
      mockZooKeeper mz = new mockZooKeeper(c);

      //Act
      mz.performTasks();

      //Assert
      assertTrue(mz.sleepCalled);
   }

   @Test
   void performTasksArrivesAt0700() {
      // Arrange
      stubClock c = new stubClock();
      c.setCurrTime(7);
      mockZooKeeper mz = new mockZooKeeper(c);

      //Act
      mz.performTasks();

      //Assert
      assertTrue(mz.arriveCalled);
   }

   @Test
   void performTasksLeavesAt2100() {
      // Arrange
      stubClock c = new stubClock();
      c.setCurrTime(21);
      mockZooKeeper mz = new mockZooKeeper(c);

      //Act
      mz.performTasks();

      //Assert
      assertTrue(mz.leaveCalled);
   }
}
