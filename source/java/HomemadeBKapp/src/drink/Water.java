package drink;

public abstract class Water implements IWater{
private int price;
//private int quantity;
private boolean ishot;

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}


    public boolean isHot() {return ishot;}
    public void setHot(boolean ishot) {this.ishot = ishot;}

    @Override
    public String toString()
    {
        return String.format("Price: %p;",
                price
        );
    }
}
