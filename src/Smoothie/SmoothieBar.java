package Smoothie;

public class SmoothieBar {

	public void makeSmoothies() {
		Smoothie s = new Smoothie(SmoothieTypes.BanaSlide);
		Smoothie ss = new Smoothie(SmoothieTypes.Citrus,SmoothieTypes.StrawberryDream);
		s.MixSmoothie();
		
		System.out.println();
		
		Mixable[] ingredients = new Mixable[] {new Lemon(), new Apple(), new Banana()};
		
		Smoothie m = new Smoothie(ingredients);
		
		m.MixSmoothie();
		
	}

}
