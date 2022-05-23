package test;

import burger.ChickenBurger;
import burger.Meat;
import drink.SoftDrink;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoftDrinkTest {

    SoftDrink drink = new SoftDrink();

    @Test
    public void SoftDrinkNotHotTest() {
        boolean got = drink.isHot();
        Assertions.assertEquals(false, got);

    }

}