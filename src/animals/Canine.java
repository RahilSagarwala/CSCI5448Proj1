package animals;

public abstract class Canine extends Animal{

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
        String output = this.getName() + " the " + this.getType() + " digs.";
        System.out.println(output);
    }

}
