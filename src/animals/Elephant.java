package animals;

import java.util.Random;

public class Elephant extends Pachyderm {

    public Elephant(){
        super();
        //TODO: Implement name generation
        myName = "Name";
    }

    @Override
    public void makeNoise() {
        String output = this.getName() + " the " + this.getType() + "Elllll.";
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
    private static String myType = "Elephant";
}
