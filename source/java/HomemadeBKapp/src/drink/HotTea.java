package drink;

public class HotTea extends Water {

    private Tea tea;

    public Tea getTea() {
        return tea;
    }
    public void setTea(Tea settea){tea = settea;}

    @Override
    public int Price() {
        return 550;
    }

    @Override
    public boolean isHot() {
        return true;
    }


}
