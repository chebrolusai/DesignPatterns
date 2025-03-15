public class Demo {
    public static void main(String[] args) {

        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " -> $" + pizza.getCost());

        Pizza pizzaWithExtraCheese = new ExtraCheeseTopping(pizza);
        System.out.println(pizzaWithExtraCheese.getDescription() + " -> $" + pizzaWithExtraCheese.getCost());

        Pizza meatPizzaWithDoubleExtraCheese = new ExtraCheeseTopping(new ExtraCheeseTopping(new MeatPizza()));
        System.out.println(meatPizzaWithDoubleExtraCheese.getDescription() + " -> $" + meatPizzaWithDoubleExtraCheese.getCost());

    }
}
