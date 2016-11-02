package ducks;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		
		mallard.performQuack(); // Calls MallardDuck's inherited performQuack() method, which then delegates
								// to the object's QuackBehavior (i.e. calls quack() on the duck's inherited 
								// quackBehavior reference)		
		
		mallard.performFly(); // Then we do the same thing with MallardDuck's inherited performFly() method
		
		
		Duck model = new ModelDuck();
		
		model.performFly(); // delegates flyBehavior object set in ModelDuck's consructor, which is a FlyNoWay instance.
		
		model.setFlyBehavior(new FlyRocketPowered()); // Invokes the model's inherited behavior setter method.
		
		model.performFly(); // see new fly behavior;

	}

}
