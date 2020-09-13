package animals;

//OO term abstract class
//override Animal's methods and encapsulate based off of species

/*When a Pachyderm is given an exercise command, 
*there is a 25% chance it will charge instead of roam.
*/
public abstract class Pachyderm extends Animal{

    @Override
    public void roam() {
        int r = rand.getChance(4);

        if ( r <= 0 ){
            this.dig();
        }
        else {
            String output = this.getName() + " the " + this.getType() + " roams.";
            System.out.println(output);
        }
    }

    public void dig() {
        String output = this.getName() + " the " + this.getType() + " charges.";
        System.out.println(output);
    }

}
