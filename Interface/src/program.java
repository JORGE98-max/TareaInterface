
public class program {

	public program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		cat c = new cat();
		c.eat();
		c.makeSound();

	}

}


interface animal{
	
	public void eat();
	public void makeSound();
}

class cat implements animal{

	@Override
	public void eat() {
		System.out.println("El gato come Whiskas");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Meow");
		
	}
	
	
}
