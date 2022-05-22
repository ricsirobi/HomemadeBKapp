package burger;

public class DoubleCheeseBurger extends CheeseBurger {
    private int cheesenumber = 2;

    @Override
    public int Price() {
        return 2000;
    }

    public int getCheeseNumber() {
        return cheesenumber;
    }




}
