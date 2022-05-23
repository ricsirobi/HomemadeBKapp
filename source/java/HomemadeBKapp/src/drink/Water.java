package drink;

public abstract class Water implements IWater{
private int price;

private boolean ishot;
private boolean hasice;
    private boolean hasco2;


    private Savour tea;

    public Savour getSavour() {
        return tea;
    }
    public void setSavour(Savour sav){tea = sav;}


    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public boolean getco2()
    {
        return hasco2;
    }
    public void setco2(boolean co2setter)
    {
        this.hasco2 = co2setter;
    }

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
