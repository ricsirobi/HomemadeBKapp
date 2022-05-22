package burger;

public class VegaBurger extends BaseBurger{
    @Override
    public int Price() {
        return 1700;
    }
    @Override
    public Meat getMeat() {
        return Meat.fakemeat;
    }

    public boolean hasSalad()
    {
        return true;
    }

}
