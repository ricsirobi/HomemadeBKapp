package burger;

public class ChickenBurger extends BaseBurger {
    @Override
    public int Price() {
        return 1250;
    }

    @Override
    public Meat getMeat() {
        return Meat.chicken;
    }




}
