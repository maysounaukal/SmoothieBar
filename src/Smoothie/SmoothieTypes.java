package Smoothie;

public enum SmoothieTypes {Citrus( new Mixable[] {new Orange(), new Orange(), new Lemon()}),
	StrawberryDream( new Mixable[] {new Strawberry(),new Orange(), new Orange(), new Banana()}),
	BanaSlide(new Mixable[] {new Banana(),new Banana(), new Orange()}),
	VegieSlurry(new Mixable[] { new Banana(), new Cellery(), new Spinache(), new Apple()});
 Mixable[] mix;

 SmoothieTypes(Mixable[] mix) {
	 this.mix = mix;
 }
public Mixable[] getMix() {
	return mix;
}

public String toString() {
	return name() + "(" + mix + ")" ;
}
 


}
