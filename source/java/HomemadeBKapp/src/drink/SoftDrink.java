package drink;

import burger.Meat;

public class SoftDrink extends Soda{


    private ESyrup syrup;

    public ESyrup getSyrup() {
        return syrup;
    }
    public void setSyrup(ESyrup setsyrup){syrup = setsyrup;}

    @Override
    public int Price() {
        return 750;
    }
    @Override
    public boolean hasIce() {
        return true;
    }

}
