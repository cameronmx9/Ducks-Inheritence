package ducks;

public abstract class Duck {
	
	FlyBehavior flyBehavior;    // Declare two reference variables for the behavior interface types.	
	QuackBehavior quackBehavior; // All duck subclasses inherit these.
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	// Set Duck's fly behavior through setter method in a duck sublcass rather than by instantiating it in the duck's constructor.
	// Call this method anytime we want to change the behavior of a duck on the FLY.
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	// Set Duck's quack behavior through setter method in a duck sublcass rather than by instantiating it in the duck's constructor.
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
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
