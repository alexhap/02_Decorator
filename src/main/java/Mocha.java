/**
 * Created by alex on 17.06.2015.
 *
 */

public class Mocha extends Decorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public float cost() {
        return 1.1f + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription().concat(" + mocha");
    }
}
