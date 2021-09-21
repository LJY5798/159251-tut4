package Tut_4;


import Tut_4.Calc;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {

    @Test
    public void test_add() {
        int x=10, y=30;
        int res = Calc.add(x,y);
        Assert.assertEquals(res ,40);
    }
}