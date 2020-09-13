package animals;

import nameGenerator.nameGenerator;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.EnumOptions;

import java.util.Random;

//Dog and Wolf classes exhibit polymorphism as they are both subclasses of Canine
public class Wolf extends Canine {

    public Wolf() {
        super();
        //TODO: Implement name generation
        myName = "Name";
    }

    public Wolf(nameGenerator ng){
        super();

        // Get unique name
        myName = ng.getUniqueName(myType);
    }

    @Override
    public void makeNoise() {
        String output = this.getName() + " the " + this.getType() + " awoo.";
        System.out.println(output);
    }

    @Override
    public String getName() { return myName; }

    @Override
    public String getType() { return myType; }

    // Member variables
    private String myName;
    private static String myType = "Wolf";
}
