package decorator.entity;

import decorator.base.BasePizza;

public class ChickenBasePizza extends BasePizza {

    @Override
    public int cost() {
        return 150;
    }
}
