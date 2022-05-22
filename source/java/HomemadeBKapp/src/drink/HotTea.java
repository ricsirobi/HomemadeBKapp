package drink;

public class HotTea extends Water {

    private Savour tea;

    public Savour getTea() {
        return tea;
    }
    public void setTea(Savour settea){tea = settea;}

    @Override
    public int Price() {
        return 550;
    }

    @Override
    public boolean isHot() {
        return true;
    }


}
