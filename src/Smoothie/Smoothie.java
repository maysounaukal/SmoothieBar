package Smoothie;

public class Smoothie {
public Mixable[] ingredients = new Mixable[0];
public SmoothieTypes type;
public Smoothie(SmoothieTypes type) {
	this.type = type;
}
public Smoothie(Mixable[] mix) {
	this.ingredients = mix;
}

public Smoothie(SmoothieTypes citrus, SmoothieTypes strawberrydream) {
	// TODO Auto-generated constructor stub
}
public void MixSmoothie() {
	for(Mixable m: ingredients) {
		m.Mix();
	}
}


}
