package dbclass;

import burger.Meat;

public class Burger
{
    private int id;
    private int mustard;
    private int mayonnaise;
    private int ketchuo;
    private int extraid;
    private Meat meat;

    public int getId() {return id;}
    public int getMustard() {return mustard;}
    public int getMayonnaise() {return mayonnaise;}
    public int getKetchuo() {return ketchuo;}
    public int getExtraid() {return extraid;}
    public Meat getMeat() {return meat;}


    public void setId(int id) {this.id=id;}
    public void setMustard(int mustard) {this.mustard=mustard;}
    public void setMayonnaise(int mayonnaise) {this.mayonnaise=mayonnaise;}
    public void setKetchuo(int ketchuo) {this.ketchuo=ketchuo;}
    public void setExtraid(int extraid) {this.extraid=extraid;}
    public void setMeat(Meat meat) {this.meat=meat;}

}
