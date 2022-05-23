package burger;

public class CheeseBurger extends BaseBurger {
    private boolean hascheese = true;

    @Override
    public int Price() {
        return 1500;
    }

    @Override
    public Meat getMeat() {
        return super.getMeat();
    }

    @Override
    public int getExtraid() {
        return 1;
    }

    public boolean hasCheese() {
        return hascheese;
    }


}
