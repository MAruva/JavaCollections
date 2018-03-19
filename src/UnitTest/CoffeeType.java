package UnitTest;

/**
 * Created by Mallika Aruva on 2/17/2018.
 */
public enum CoffeeType {
    LATTE(5, 5),
    MOCHA(5, 3),
    CAPPUCINO(5, 2);

    CoffeeType(int requiredBeans, int requiredMilk) {
        this.requiredBeans = requiredBeans;
        this.requiredMilk = requiredMilk;
    }

    private int requiredBeans;
    private int requiredMilk;

    public int getRequiredBeans() {
        return requiredBeans;
    }

    public int getRequiredMilk() {
        return requiredMilk;
    }


}
