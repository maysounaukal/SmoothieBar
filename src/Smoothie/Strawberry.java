package Smoothie;

public class Strawberry extends Fruit implements Mixable {
public double price = 2;

@Override
public void Mix() {
	System.out.println("Strawberry Is pressed and added\"");
	
}

@Override
public double GetPrice() {
	
	return price;
}

}
