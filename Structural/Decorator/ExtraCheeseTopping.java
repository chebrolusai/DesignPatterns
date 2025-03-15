public class ExtraCheeseTopping extends PizzaToppings{

    public ExtraCheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", With extra cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5;
    }

}
