package Smoothie;

public class Spinache extends Vegetable implements Mixable{
public double price = 1.25;

@Override
public void Mix() {
	System.out.println("Spinache is Mashed and added");
	
}

@Override
public double GetPrice() {
	
	return price;
}

}
