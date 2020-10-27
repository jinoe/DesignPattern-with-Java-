package programming.practice.factory;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore pizzaStore = new PizzaStore();
		
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+" °í°´Àü´Þ\n");
		/*pizza = pizzaStore.orderPizza("Greek");
		System.out.println(pizza+" °í°´Àü´Þ\n");*/
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+" °í°´Àü´Þ\n");
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+" °í°´Àü´Þ\n");
		pizza = pizzaStore.orderPizza("viggie");
		System.out.println(pizza+" °í°´Àü´Þ\n");
		
		System.out.println("git ¼­¹ö¿¡ Çª½¬");
	}

}
