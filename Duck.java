package ducks;

public abstract class Duck {
	
	FlyBehavior flyBehavior;    // Declare two reference variables for the behavior interface types.	
	QuackBehavior quackBehavior; // All duck subclasses inherit these.
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();   // Delegate to behavior class.
	}
	
	public void performQuack(){
		quackBehavior.quack();  // Delegate to behavior class.
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}

}
