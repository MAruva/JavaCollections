package UnitTest;

/**
 * Created by Mallika Aruva on 2/17/2018.
 */
public class CoffeeBar {

    public void setMilkAvailable(int milkAvailable) {
        this.milkAvailable = milkAvailable;
    }

    public void setCoffeeBeansAvailable(int coffeeBeansAvailable) {
        this.coffeeBeansAvailable = coffeeBeansAvailable;
    }

    private int milkAvailable ;
    private int coffeeBeansAvailable ;

    public Coffee brew(CoffeeType coffeeType, int quantity) {
        // Check beans and milk required

        int beansRequired = coffeeType.getRequiredBeans() * quantity;
        int milkRequired = coffeeType.getRequiredMilk() * quantity;

        //check if we have enough beans
        if (beansRequired > getCoffeeBeansAvailable() || milkRequired > getMilkAvailable()) {

            throw new IllegalArgumentException("Not Enough Milk/Beans");

        } else {
            coffeeBeansAvailable -= beansRequired;
            milkAvailable -= milkRequired;
            return new Coffee(coffeeType, beansRequired, milkRequired);
        }

    }

    public int getMilkAvailable() {
        return milkAvailable;
    }

    public int getCoffeeBeansAvailable() {
        return coffeeBeansAvailable;
    }

}
