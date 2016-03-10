/**
 * Created by alex on 17.06.2015.
 *
 */

public class Whip extends Decorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public float cost() {
        return 1.75f + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription().concat(" + whip");
    }
}
