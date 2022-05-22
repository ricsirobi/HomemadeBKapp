package drink;

public abstract class Water implements IWater{
private int price;

private boolean ishot;
private boolean hasice;

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}


    public boolean isHot() {return ishot;}
    public void setHot(boolean ishot) {this.ishot = ishot;}

    public boolean hasIce() {return hasice;}
    public void setIce(boolean hasice) {
        if(ishot)
            this.hasice = false;
        else
        this.hasice = hasice;
    }

    @Override
    public String toString()
    {
        return String.format("Price: %p;",
                price
        );
    }
}
