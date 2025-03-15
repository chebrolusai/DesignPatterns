public class MeatPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Meat Pizza";
    }

    @Override
    public double getCost() {
        return 16.0;
    }

}
