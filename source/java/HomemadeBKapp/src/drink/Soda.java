package drink;

public class Soda extends Water {

    @Override
    public int Price() {
        return 350;
    }

    @Override
    public boolean isHot() {
        return false;
    }

    @Override
    public boolean hasIce() {
        return false;
    }

    @Override
    public boolean getco2() {
        return true;
    }
}
