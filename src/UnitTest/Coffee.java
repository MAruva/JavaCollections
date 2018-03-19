package UnitTest;

/**
 * Created by Mallika Aruva on 2/17/2018.
 */
public class Coffee {

    private CoffeeType coffeeType;
    private int beans;
    private int milk;

    @Override
    public String toString() {
        return "CoffeeBar{" +
                "coffeeType=" + coffeeType +
                ", beans=" + beans +
                ", milk=" + milk +
                '}';
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public Coffee(CoffeeType coffeeType, int beans, int milk) {
        this.coffeeType = coffeeType;
        this.beans = beans;
        this.milk = milk;
    }
}
