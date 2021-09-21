package Tut_4;

import Tut_4.Calc;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

public class TestSubtract {

    @Test
    public void test_subtract() {
        int x=100;
        int y=30;
        int res = Calc.subtract(x,y);
        Assert.assertEquals(res ,70);
    }
}