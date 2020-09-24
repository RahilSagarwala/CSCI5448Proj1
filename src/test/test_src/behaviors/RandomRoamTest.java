package behaviors;

import animals.Animal;
import animals.Cat;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import static org.junit.jupiter.api.Assertions.*;

public class RandomRoamTest {

   // Add Empty List and test if it fails
   @Test
   void addEmptyList() {
      ProbablisticMultipleBehavior behavior = new ProbablisticMultipleBehavior();

      ArrayList<Behavior> behaviors = new ArrayList<Behavior>();
      double[] probabilities = new double[] {};

      boolean success = behavior.setBehaviors(behaviors, probabilities);
      assertFalse(success);
   }

   // Add 2 Behaviors and test if it succeeds
   @Test
   void addTwoBehaviors() {
      ProbablisticMultipleBehavior behavior = new ProbablisticMultipleBehavior();

      ArrayList<Behavior> behaviors = new ArrayList<Behavior>(Arrays.asList(new Roam(), new Dig()));
      double[] probabilities = new double[] {0.75, 0.25};

      boolean success = behavior.setBehaviors(behaviors, probabilities);
      assertTrue(success);
   }

   // Add 2 Behaviors w/ over prob. of 1 and test if it fails
   @Test
   void addTwoBehaviorsOverProbabilityOf1() {
      ProbablisticMultipleBehavior behavior = new ProbablisticMultipleBehavior();

      ArrayList<Behavior> behaviors = new ArrayList<Behavior>(Arrays.asList(new Roam(), new Dig()));
      double[] probabilities = new double[] {0.75, 0.50};

      boolean success = behavior.setBehaviors(behaviors, probabilities);
      assertFalse(success);
   }

   // Add Unequal length of behaviors and probabilities and test if it fails
   @Test
   void addUnequalLengthOfBehaviors() {
      ProbablisticMultipleBehavior behavior = new ProbablisticMultipleBehavior();

      ArrayList<Behavior> behaviors = new ArrayList<Behavior>(Arrays.asList(new Roam(), new Dig()));
      double[] probabilities = new double[] {0.75};

      boolean success = behavior.setBehaviors(behaviors, probabilities);
      assertFalse(success);
   }

   // Add More than 2 behaviors and test if it succeeds
   @Test
   void addMoreThanTwoBehaviors() {
      ProbablisticMultipleBehavior behavior = new ProbablisticMultipleBehavior();

      ArrayList<Behavior> behaviors = new ArrayList<Behavior>(Arrays.asList(new Roam(), new Dig(), new Stalk()));
      double[] probabilities = new double[] {0.50, 0.25, 0.25};

      boolean success = behavior.setBehaviors(behaviors, probabilities);
      assertTrue(success);
   }

   // Add Empty Array and expects for empty string.
   @Test
   void returnEmptryStringIfNull() {
      ProbablisticMultipleBehavior behavior = new ProbablisticMultipleBehavior();

      ArrayList<Behavior> behaviors = new ArrayList<Behavior>();
      double[] probabilities = new double[] {};

      boolean success = behavior.setBehaviors(behaviors, probabilities);
      Animal animal = new Cat();
      String output = behavior.takeAction(animal);
      assertEquals(output, "");
   }

   @Test
   void returnAlmostEqualsToGivenProbabilities() {
      ProbablisticMultipleBehavior behavior = new ProbablisticMultipleBehavior();

      ArrayList<Behavior> behaviors = new ArrayList<Behavior>(Arrays.asList(new Roam(), new Dig(), new Stalk()));
      double[] probabilities = new double[] {0.50, 0.25, 0.25};

      boolean success = behavior.setBehaviors(behaviors, probabilities);

      Animal animal = new Cat();

      Map<String, Integer> hashmap = new HashMap<String, Integer>();
      for (int i=0; i<10000; i++) {
         String output = behavior.takeAction(animal);
         String last_word = output.substring(13) ;
         Integer j = hashmap.get(last_word);
         hashmap.put(last_word, (j == null) ? 1 : j+1 );
      }

      assertEquals(5000, hashmap.get("roams."), 200);
      assertEquals(2500, hashmap.get("digs."), 100);
      assertEquals(2500, hashmap.get("stalks."), 100);
   }
}
