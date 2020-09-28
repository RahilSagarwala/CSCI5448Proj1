package employees;

import clock.Clock;

public class mockZooKeeper extends ZooKeeper {
   public mockZooKeeper(){
      wakeCalled = false;
      playCalled = false;
      chaseCalled = false;
      feedCalled = false;
      sleepCalled = false;
      arriveCalled = false;
      leaveCalled = false;
   }

   public mockZooKeeper(Clock c){
      setClock(c);
      wakeCalled = false;
      playCalled = false;
      chaseCalled = false;
      feedCalled = false;
      sleepCalled = false;
      arriveCalled = false;
      leaveCalled = false;
   }

   public boolean wakeCalled;
   @Override
   public void wakeUpAnimals() {
      wakeCalled = true;
   }

   public boolean playCalled;
   @Override
   public void playWithAnimals() {
      playCalled = true;
   }

   public boolean chaseCalled;
   @Override
   public void chaseAnimals() {
      chaseCalled = true;
   }

   public boolean feedCalled;
   @Override
   public void feedAnimals() {
      feedCalled = true;
   }

   public boolean sleepCalled;
   @Override
   public void putAnimalsToSleep() {
      sleepCalled = true;
   }

   public boolean arriveCalled;
   @Override
   public void arrivesAtZoo(int day) {
      arriveCalled = true;
   }

   public boolean leaveCalled;
   @Override
   public void leaveZoo(int day) {
      leaveCalled = true;
   }
}
