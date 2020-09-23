package behaviors;

import animals.Animal;
import animals.Cat;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import static org.junit.jupiter.api.Assertions.*;

public class RandomRoamTest {

   // Add Empty List and test if it fails
   @Test
   void addEmptyList() {
      RoamBehavior roamBehavior = new RandomRoam();

      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      double[] probabilities = new double[] {};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);
      assertFalse(success);
   }

   // Add 2 Behaviors and test if it succeeds
   @Test
   void addTwoBehaviors() {
      RoamBehavior roamBehavior = new RandomRoam();

      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      roamBehaviors.add(new Roam());
      roamBehaviors.add(new Dig());
      double[] probabilities = new double[] {0.75, 0.25};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);
      assertTrue(success);
   }

   // Add 2 Behaviors w/ over prob. of 1 and test if it fails
   @Test
   void addTwoBehaviorsOverProbabilityOf1() {
      RoamBehavior roamBehavior = new RandomRoam();

      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      roamBehaviors.add(new Roam());
      roamBehaviors.add(new Dig());
      double[] probabilities = new double[] {0.75, 0.50};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);
      assertFalse(success);
   }

   // Add Unequal length of behaviors and probabilities and test if it fails
   @Test
   void addUnequalLengthOfBehaviors() {
      RoamBehavior roamBehavior = new RandomRoam();

      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      roamBehaviors.add(new Roam());
      roamBehaviors.add(new Dig());
      double[] probabilities = new double[] {0.75};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);
      assertFalse(success);
   }

   // Add More than 2 behaviors and test if it succeeds
   @Test
   void addMoreThanTwoBehaviors() {
      RoamBehavior roamBehavior = new RandomRoam();

      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      roamBehaviors.add(new Roam());
      roamBehaviors.add(new Dig());
      roamBehaviors.add(new Stalk());
      double[] probabilities = new double[] {0.50, 0.25, 0.25};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);
      assertTrue(success);
   }

   // Add Empty Array and expects for empty string.
   @Test
   void returnEmptryStringIfNull() {
      RoamBehavior roamBehavior = new RandomRoam();

      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      double[] probabilities = new double[] {};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);

      Animal animal = new Cat();
      String output = roamBehavior.roam(animal);
      assertEquals(output, "");
   }

   @Test
   void returnAlmostEqualsToGivenProbabilities() {
      RoamBehavior roamBehavior = new RandomRoam();

      ArrayList<RoamBehavior> roamBehaviors = new ArrayList<RoamBehavior>();
      roamBehaviors.add(new Roam());
      roamBehaviors.add(new Dig());
      roamBehaviors.add(new Stalk());
      double[] probabilities = new double[] {0.50, 0.25, 0.25};
      boolean success = roamBehavior.setRoamBehaviors(roamBehaviors, probabilities);

      Animal animal = new Cat();

      Map<String, Integer> hashmap = new HashMap<String, Integer>();
      for (int i=0; i<10000; i++) {
         String output = roamBehavior.roam(animal);
         String last_word = output.substring(13) ;
         Integer j = hashmap.get(last_word);
         hashmap.put(last_word, (j == null) ? 1 : j+1 );
      }

      assertEquals(5000, hashmap.get("roams."), 200);
      assertEquals(2500, hashmap.get("digs."), 100);
      assertEquals(2500, hashmap.get("stalks."), 100);
   }
}
