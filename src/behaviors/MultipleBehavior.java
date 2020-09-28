package behaviors;

import animals.Animal;

import java.util.ArrayList;

public abstract class MultipleBehavior implements Behavior {
   public abstract String takeAction(Animal animal);
   protected ArrayList<Behavior> behaviors;
}
