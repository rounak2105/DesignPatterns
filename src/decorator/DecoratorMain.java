package decorator;

import decorator.base.BasePizza;
import decorator.entity.CheeseTopping;
import decorator.entity.ChickenBasePizza;
import decorator.entity.MushroomTopping;

public class DecoratorMain {
    public static void main(String[] args) {
        BasePizza basePizza = new ChickenBasePizza();
        System.out.println(basePizza.cost());
        basePizza = new MushroomTopping(basePizza);
        System.out.println(basePizza.cost());
        basePizza = new CheeseTopping(basePizza);
        System.out.println(basePizza.cost());
        basePizza = new CheeseTopping(new MushroomTopping(new CheeseTopping(basePizza)));
        System.out.println(basePizza.cost());
    }
}
