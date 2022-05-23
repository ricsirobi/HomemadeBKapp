package drink;

public class HotTea extends Water {



    @Override
    public int Price() {
        return 550;
    }

    @Override
    public boolean isHot() {
        return true;
    }

    @Override
    public boolean getco2() {
        return false;
    }
}
