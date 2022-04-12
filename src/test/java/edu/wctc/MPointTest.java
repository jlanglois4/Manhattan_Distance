package edu.wctc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MPointTest {

    private MPoint mPoint;

    @BeforeEach
    void setUp() {
        mPoint = new MPoint();
    }

    @Test
    void TestMPoint(){
        mPoint.CalculateManDistance(5,13);
    }
}
