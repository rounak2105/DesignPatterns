package decorator.entity;

import decorator.base.BasePizza;
import decorator.base.ToppingDecorator;

public class MushroomTopping extends ToppingDecorator {
    private BasePizza basePizza;
    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
