package programming.practice.strategy;

import programming.practice.strategy.behavior.FloatOnWater;
import programming.practice.strategy.behavior.FlyNoWay;
import programming.practice.strategy.behavior.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.quackable = new Squeak();
		this.swimable = new FloatOnWater();
		this.flyable = new FlyNoWay();
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("고무오리~");
	}
	
}
