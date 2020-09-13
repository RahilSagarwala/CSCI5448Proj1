package zoo;

import animals.*;
import nameGenerator.nameGenerator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Class.forName;

public class Zoo_Main {
   public static void main(String[] args) {
      // TODO: add buffalo and yak to list once they are created
      String[] animalTypes = new String[]{"animals.Cat", "animals.Dog", "animals.Elephant",
               "animals.Hippo", "animals.Lion", "animals.Tiger", "animals.Rhino", "animals.Wolf"};
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
            zooAnimals.add((Animal) c.newInstance(ng));
            zooAnimals.add((Animal) c.newInstance(ng));
         } catch (ClassNotFoundException | NoSuchMethodException |
                  IllegalAccessException | InstantiationException |
                  InvocationTargetException e) {
            e.printStackTrace();
         }
      }

      //Print names and types of all the animals
      for (Animal a : zooAnimals) {
         String output = a.getName() + " the " + a.getType() + " is in the zoo.";
         System.out.println(output);
      }

   }
}
