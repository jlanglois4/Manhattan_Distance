package edu.wctc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MPointTest {

    @BeforeEach
    void setUp(){
        MPoint Point1 = new MPoint(5,10);
        MPoint mPoint2 = new MPoint(10, 42);
    }

    private double formula(double x1, double y1, double x2, double y2){
        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }

    @Test
    void TestManhattenDistance(){
        assertEquals(37,formula(5,10,10,42));
    }

    @Test
    void TestManhattenDistanceNegatives(){
        assertEquals(67,formula(-5,10,10,-42));
    }

    @Test
    void TestManhattenDistanceDoubles(){
        assertEquals(130.38,formula(-25.14,10.25,62.12,-32.87));
    }
}
