package TestDrivenDevelopment;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Mallika Aruva on 2/17/2018.
 */
/*
A Leap year is -
- divisible by 4
-not divisible by 100
-divisible by 400
 */
public class LeapYearTest {

    @Test
    public void isYearDivisibleBy4() {
        assertTrue(String.valueOf(true), LeapYear.isLeap(2020));
    }

    @Test
    public void normalYearsNotDivisibleBy100() {
        assertFalse(LeapYear.isLeap(2015));
    }
    
}
