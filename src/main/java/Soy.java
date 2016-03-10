/**
 * Created by alex on 17.06.2015.
 *
 */

public class Soy extends Decorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public float cost() {
        return 1.5f + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription().concat(" + soy");
    }
}
