package animals;

import nameGenerator.nameGenerator;

import java.util.Random;

public class Dog extends Canine {

    public Dog(){
        super();
        //TODO: Implement name generation
        myName = "Name";
    }

    public Dog(nameGenerator ng){
        super();

        // Get unique name
        myName = ng.getUniqueName(myType);
    }

    @Override
    public void makeNoise() {
        String output = this.getName() + " the " + this.getType() + " woof.";
        System.out.println(output);
    }

    @Override
    public String getName() {
        return myName;
    }

    @Override
    public String getType() {
        return myType;
    }

    // Member variables
    private String myName;
    private static String myType = "Dog";
}
