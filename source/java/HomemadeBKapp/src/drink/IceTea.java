package drink;

public class IceTea extends Water{
    private Tea tea;

    public Tea getTea() {
        return tea;
    }
    public void setTea(Tea settea){tea = settea;}

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
