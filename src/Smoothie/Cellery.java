package Smoothie;

public class Cellery extends Vegetable implements Mixable {
public double price = 1;

@Override
public void Mix() {
	System.out.println("Celery is cut and added");
	
}

@Override
public double GetPrice() {
	
	return price;
}

}
