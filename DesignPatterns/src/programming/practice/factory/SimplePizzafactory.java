package programming.practice.factory;

public class SimplePizzafactory {

	public static Pizza createPizza(String name) {
		Pizza pizza = null;
		
		if(name.equals("cheese")) {
			pizza = new CheesePizza();
		}
		/*else if(pizzaName.equals("Greek")) {
			pizza = new GreekPizza();
		}*/
		else if(name.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		else if(name.equals("clam")) {
			pizza = new ClamPizza();
		}
		else if(name.equals("viggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
