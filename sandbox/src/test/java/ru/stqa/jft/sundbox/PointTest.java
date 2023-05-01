package ru.stqa.jft.sundbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.jft.sandbox.Point;

public class PointTest {

@Test
    public void testPoint(){

        Point p1 = new Point(0, 10);
        Point p2 = new Point(0, 16);
        Assert.assertEquals(p1.distance(p2),6.0);
    }

}
