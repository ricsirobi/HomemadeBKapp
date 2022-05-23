package dbclass;

import burger.Meat;

public class Burger
{
    private int id;
    private boolean mustard;
    private boolean mayonnaise;
    private boolean ketchuo;
    private int extraid;
    private Meat meat;

    public int getId() {return id;}
    public boolean getMustard() {return mustard;}
    public boolean getMayonnaise() {return mayonnaise;}
    public boolean getKetchuo() {return ketchuo;}
    public int getExtraid() {return extraid;}
    public Meat getMeat() {return meat;}


    public void setId(int id) {this.id=id;}
    public void setMustard(boolean mustard) {this.mustard=mustard;}
    public void setMayonnaise(boolean mayonnaise) {this.mayonnaise=mayonnaise;}
    public void setKetchup(boolean ketchuo) {this.ketchuo=ketchuo;}
    public void setExtraid(int extraid) {this.extraid=extraid;}
    public void setMeat(Meat meat) {this.meat=meat;}

}
