package animals;

import nameGenerator.nameGenerator;

import java.util.Random;

//Rhino, Hippo, and Eelephant classes exhibit polymorphism as they are both subclasses of Pachyderm
public class Rhino extends Pachyderm {

    public Rhino(){
        super();
        //TODO: Implement name generation
        myName = "Name";
    }

    public Rhino(nameGenerator ng){
        super();

        // Get unique name
        myName = ng.getUniqueName(myType);
    }

    @Override
    public void makeNoise() {
        String output = this.getName() + " the " + this.getType() + "Rhiiiii.";
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
    private static String myType = "Rhino";
}
