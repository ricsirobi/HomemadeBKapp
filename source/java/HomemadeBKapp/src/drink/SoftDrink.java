package drink;

public class SoftDrink extends Soda{


    private Savour syrup;

    public Savour getSyrup() {
        return syrup;
    }
    public void setSyrup(Savour setsyrup){syrup = setsyrup;}

    @Override
    public int Price() {
        return 750;
    }
    @Override
    public boolean hasIce() {
        return true;
    }

}
