package drink;

public class IceTea extends Water{
    private Savour tea;

    public Savour getTea() {
        return tea;
    }
    public void setTea(Savour settea){tea = settea;}

    @Override
    public int Price() {
        return 650;
    }

    @Override
    public boolean isHot() {return false;}
    @Override
    public boolean hasIce() {
        return true;
    }

}
