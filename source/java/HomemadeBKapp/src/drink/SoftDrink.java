package drink;

import burger.Meat;

public class SoftDrink extends Soda{

    private boolean hasice = true;
    private ESyrup syrup;

    public ESyrup getSyrup() {
        return ESyrup.Pepsi;
    }
    public void setSyrup(ESyrup setsyrup){syrup = setsyrup;}

    @Override
    public int Price() {
        return 750;
    }

    public boolean hasIce() {
        return hasice;
    }

}
