package ducks;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		
		//Our model duck begins life grounded, w/o a way to fly..
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a model duck");
	}

}
