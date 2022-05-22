package burger;

public interface IBaseBurger {
    public int Price();
    public boolean hasKetchup();
    public boolean hasMustard();
    public boolean hasMayonnaise();
    public Meat getMeat();
}