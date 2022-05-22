package burger;

public class CheeseBurger extends BaseBurger {
    private boolean hascheese = true;

    @Override
    public int Price() {
        return 1500;
    }

    @Override
    public Meat getMeat() {
        return Meat.beef;
    }

    public boolean hasCheese() {
        return hascheese;
    }


}
