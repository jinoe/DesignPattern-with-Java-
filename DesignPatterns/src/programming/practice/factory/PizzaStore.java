package programming.practice.factory;

public class PizzaStore {
	
	
	public Pizza orderPizza(String pizzaName) {
		Pizza pizza = SimplePizzafactory.createPizza(pizzaName);
		if(pizza == null) {
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.box();
		
		return pizza;
	}
}
