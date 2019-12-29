package Smoothie;

public class Orange extends Fruit implements Mixable{
public double price = 1;
	@Override
	public void Mix() {
		System.out.println("Orange is pressed and added");
		
	}

	@Override
	public double GetPrice() {
	
		return price;
	}

}
