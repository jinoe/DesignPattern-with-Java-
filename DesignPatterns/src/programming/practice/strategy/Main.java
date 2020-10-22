package programming.practice.strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new MallardDuck();
		duck.quack();
		duck.swim();
		duck.display();
		duck.fly();
		
		duck = new RedheadDuck();
		duck.quack();
		duck.swim();
		duck.display();
		duck.fly();
		
		duck = new RubberDuck();
		duck.quack();
		duck.swim();
		duck.display();
		duck.fly();
		
		duck  = new DecoyDuck();
		duck.quack();
		duck.swim();
		duck.display();
		duck.fly();
	}
}
