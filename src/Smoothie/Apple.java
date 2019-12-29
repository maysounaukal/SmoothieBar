package Smoothie;

public class Apple extends Fruit implements Mixable{
public double price = 0.5;

@Override
public void Mix() {
	System.out.println("Apple Is pressed and added\"");
	
}

@Override
public double GetPrice() {

	return price;
}

}
