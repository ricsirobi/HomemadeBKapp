package test;

import burger.ChickenBurger;
import burger.Meat;
import dbclass.Burger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ChickenBurgerTest
{
    ChickenBurger burger = new ChickenBurger();

    @Test
    public void chickenBurgerMeatTest() {
        Meat got = burger.getMeat();

        Assertions.assertEquals(Meat.chicken, got);

    }

}