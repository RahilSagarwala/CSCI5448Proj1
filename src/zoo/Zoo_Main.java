package zoo;

import animals.*;
import clock.ZooClock;
import employees.*;
import nameGenerator.nameGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Class.forName;

public class Zoo_Main {
   public static void main(String[] args) {
      // List the different types of animals to create
      String[] animalTypes = new String[]{"animals.Cat", "animals.Dog", "animals.Elephant",
               "animals.Hippo", "animals.Lion", "animals.Tiger", "animals.Rhino",
               "animals.Wolf", "animals.Buffalo", "animals.Yak"};
      List<Animal> zooAnimals = new ArrayList<Animal>();
      nameGenerator ng = new nameGenerator();

      // Iterate over the types listed in animal types, and create 2 of each of them in the zoo.
      for(int i = 0; i < animalTypes.length; i++){
         // generic class instantiation code referenced:
         // https://www.geeksforgeeks.org/new-operator-vs-newinstance-method-java/
         // https://stackoverflow.com/questions/30188805/reflection-newinstance-constructor-java-wrong-number-of-arguments
         // https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Constructor.html#newInstance-java.lang.Object...-
         // https://www.tutorialspoint.com/javareflect/javareflect_constructor_newinstance.htm
         try {
            Constructor c = forName(animalTypes[i]).getDeclaredConstructor(nameGenerator.class);
            // This instantiates the collection of animals. The name generator provides each animal
            // instance with a unique name that is the objects identity.
            zooAnimals.add((Animal) c.newInstance(ng));
            zooAnimals.add((Animal) c.newInstance(ng));
         } catch (ClassNotFoundException | NoSuchMethodException |
                  IllegalAccessException | InstantiationException |
                  InvocationTargetException e) {
            e.printStackTrace();
         }
      }

      // Instantiate the clock object
      clock.Clock clock = new ZooClock();
      clock.setClockStart(7);
      clock.setClockEnd(21);

      // Instantiate the zoo keeper object.
      // The zoo keeper will get a unique name which can be used as the objects identity
      // provided to it by the name generator
      // and it also takes in a collection of animal objects that the zookeeper is
      // responsible for taking care of.
      ZooKeeper zk = new ZooKeeper(ng, zooAnimals, clock);
      ZooAnnouncer zooAnnouncer = new ZooAnnouncer(ng, clock);
      zk.addObserver(zooAnnouncer);

      // Take input of the # of days to run
      // Buffered Reader code taken from:
      // https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/
      System.out.print("Enter number of days to run: ");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int numDays = -1;
      try {
         numDays = Integer.parseInt(reader.readLine());
      } catch (IOException e) {
         e.printStackTrace();
      }

      // Have the clock run for the number of days.
      // The necessary classes observe the clock and perform
      // their tasks based on the time of day.
      if( numDays <= 0 ){
         System.out.println("Error: Must enter number > 0 for the number of days to run.");
         System.exit(1);
      }
/*
      for(int i=0; i < numDays; i++){
         int day = i + 1;
         String output = "~~~~~~~~~~~~~~~~~ Day " + day + " ~~~~~~~~~~~~~~~~~";
         System.out.println(output);
         zooAnnouncer.arrivesAtZoo(day);
         zk.arrivesAtZoo(day);
         zk.wakeUpAnimals();
         zk.playWithAnimals();
         zk.feedAnimals();
         zk.chaseAnimals();
         zk.putAnimalsToSleep();
         zk.leaveZoo(day);
         zooAnnouncer.leaveZoo(day);
      }
*/
      clock.setClockDays(numDays);
      clock.startClock();
   }
}
