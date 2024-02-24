package decorator.entity;

import decorator.base.BasePizza;
import decorator.base.ToppingDecorator;

public class CheeseTopping extends ToppingDecorator {
    private BasePizza basePizza;
    public CheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 15;
    }
}
