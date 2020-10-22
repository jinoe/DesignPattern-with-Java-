package programming.practice.strategy;

import programming.practice.strategy.behavior.FlyNoWay;
import programming.practice.strategy.behavior.Quack;
import programming.practice.strategy.behavior.SwimWithLegs;

public class RobotDuck extends Duck {
	
	public RobotDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyNoWay();
	}
	
	
	public void display() {
		// TODO Auto-generated method stub

	}

}
