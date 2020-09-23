package behaviors;

import animals.Animal;

import java.util.ArrayList;

public interface  RoamBehavior {
   public String roam(Animal animal);
   public default boolean setRoamBehaviors(ArrayList<RoamBehavior> roamBehaviors, double[] probabilities) { return true; }
}
