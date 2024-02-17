package Abstraction;

abstract class Car{
	public abstract void drive();
	public void playMusic() {
		System.out.println("Playing music!!!!!");
	}
}

class BMW extends Car{
	public void drive() {
		System.out.println(" You are driving!!");
	}
}

public class FirstDemo {

	public static void main(String[] args) {
		
		Car obj1=new BMW();
		obj1.drive();
		obj1.playMusic();

	}

}
