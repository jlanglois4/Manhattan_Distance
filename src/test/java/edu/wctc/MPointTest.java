package edu.wctc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MPointTest {

    @BeforeEach
    void CanCreate(){
        MPoint Point1 = new MPoint(5,10);
        MPoint mPoint2 = new MPoint(10, 42);
    }

    private int formula(int x1, int y1, int x2, int y2){
        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }

}
