package Smoothie;

public class Lemon extends Fruit implements Mixable{
	public double price = 0.75;

	@Override
	public void Mix() {
		System.out.println("Lemon Is pressed and added");
		
	}

	@Override
	public double GetPrice() {
		
		return price;
	}

}
