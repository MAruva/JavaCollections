package UnitTest;


import org.junit.Assert;
import org.junit.Test;

import static UnitTest.CoffeeType.CAPPUCINO;
import static org.junit.Assert.assertEquals;

/**
 * Created by Mallika Aruva on 2/17/2018.
 */

public class CoffeeBarTest {

    @Test
    public void canBrew() {
        //Given
        CoffeeBar coffeeBar = new CoffeeBar();
        coffeeBar.setCoffeeBeansAvailable(5);
        coffeeBar.setMilkAvailable(5);
        //When
        Coffee coffee = coffeeBar.brew(CAPPUCINO, 1);

        //Then
        assertEquals(5, coffee.getBeans());
        assertEquals(CAPPUCINO, coffee.getCoffeeType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionWhenBeanRequirementMoreThanAvaialbility() {

        //Given
        CoffeeBar coffeeBar = new CoffeeBar();
        coffeeBar.setCoffeeBeansAvailable(5);
        coffeeBar.setMilkAvailable(1);
        //When
        Coffee coffee = coffeeBar.brew(CAPPUCINO, 1);

        //Then
        //We expect a Exception here
    }


    @Test
    public void testBeanAvailability() {
        //Given
        CoffeeBar coffeeBar = new CoffeeBar();
        coffeeBar.setCoffeeBeansAvailable(5);
        coffeeBar.setMilkAvailable(5);

        //When
        coffeeBar.brew(CAPPUCINO, 1);

        //Then
        assertEquals(0, coffeeBar.getCoffeeBeansAvailable());
    }

    @Test
    public void testMilkAvailability() {
        //Given
        CoffeeBar coffeeBar = new CoffeeBar();
        coffeeBar.setCoffeeBeansAvailable(5);
        coffeeBar.setMilkAvailable(5);

        //When
        coffeeBar.brew(CAPPUCINO, 1);

        //Then
        assertEquals(3, coffeeBar.getMilkAvailable());
    }


}
