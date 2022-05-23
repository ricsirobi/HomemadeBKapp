package burger;

public abstract class BaseBurger implements IBaseBurger {

    private double price;
    private boolean hasketchup;
    private boolean hasmustard;
    private boolean hasmayonnaise;
    private Meat mymeat;
    private int extraid;

    public Meat getMeat(){return mymeat;}
    public void setMeat(Meat setm){mymeat = setm;}

    public boolean hasKetchup() {
        return hasketchup;
    }
    public void setKetchup(boolean sauce) {
        hasketchup = sauce;
    }


    public boolean hasMustard() {
        return hasmustard;
    }
    public void setMustard(boolean sauce) {
        hasmustard = sauce;
    }


    public boolean hasMayonnaise() {
        return hasmayonnaise;
    }
    public void setMayonnaise(boolean sauce) {
        hasmayonnaise = sauce;
    }

    public int getExtraid() {
        return extraid;
    }
    public void setExtraid(int extraid) {
        this.extraid = extraid;
    }



    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}


    @Override
    public String toString()
    {
        return String.format("Price: %p;",
                price
        );
    }
}