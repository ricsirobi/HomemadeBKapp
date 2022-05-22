package dbclass;

import drink.Savour;

public class Drink {
    private int id;
    private int isHot;
    private int hasCo2;
    private Savour savour;
    private int hasIce;

    public int getHasCo2() {return hasCo2;}
    public int getIsHot() {return isHot;}
    public int getHasIce() {return hasIce;}
    public Savour getSavour() {return savour;}
    public int getId() {return id;}

    public void setHasCo2(int hasCo2) {this.hasCo2 = hasCo2;}
    public void setIsHot(int isHot) {this.isHot = isHot;}
    public void setSavour(Savour savour) {this.savour = savour;}
    public void setHasIce(int hasIce) {this.hasIce = hasIce;}
    public void setId(int id) {this.id=id;}

}
