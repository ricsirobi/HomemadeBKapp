package drink;

public class Soda extends Water {
    private boolean hasco2 = true;

    @Override
    public int Price() {
        return 350;
    }

    @Override
    public boolean isHot() {
        return false;
    }

    public boolean hasCo2() {return hasco2;}

}
