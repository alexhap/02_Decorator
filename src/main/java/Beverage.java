/**
 * Created by alex on 16.06.2015.
 *
 */

import java.util.*;

public abstract class Beverage {
    protected String description = "no name";

    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public static void main(String args[]) {
        List<Beverage> lst = new ArrayList<>();
        lst.add(new Espresso());
        lst.add(new DarkRoast());
        lst.add(new HouseBlend());
        lst.add(new Mocha(new DarkRoast()));
        lst.add(new Mocha(new Mocha(new DarkRoast())));
        lst.add(new Soy(new Espresso()));
        lst.add(new Whip(new Mocha(new HouseBlend())));
        lst.add(new Mocha(new HouseBlend()));
//        lst.add(new Mocha(null));

        for (Beverage item : lst)
            System.out.printf("Name: %s \tprice: %.2f\n", item.getDescription(), item.cost());
    }
}
