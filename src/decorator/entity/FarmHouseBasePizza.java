package decorator.entity;

import decorator.base.BasePizza;

public class FarmHouseBasePizza extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
