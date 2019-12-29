package Smoothie;

public class Banana extends Fruit implements Mixable {
public double price = 1.25;

@Override
public void Mix() {
	System.out.println("BananaIs pressed and added\"");
	
}

@Override
public double GetPrice() {

	return price;
}

}
