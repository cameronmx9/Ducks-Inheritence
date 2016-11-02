package ducks;

public class MallardDuck extends Duck{
	
	//MallardDuck inherits quackBeahvior and flyBehavior instance variables from class Duck
	public MallardDuck() {
		quackBehavior = new Quack(); //A MallardDuck used the Quack Class to handle its quack,
									 // so when performQuack is called, the responsibility for the quack is delegated to
									// the Quack object and we get a real quack.
									
		flyBehavior = new FlyWithWings(); //And it used FlyWithWings as its FlyBehavior type.
	}

	@Override 
	public void display() {
		System.out.println("I'm a real Mallard Duck");
		
	}
	


}
