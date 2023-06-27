package esercizio1;

public class Rettangolo {
	
	private double latoMinore, latoMaggiore;
	
	public Rettangolo(double latoMinore, double latoMaggiore) {
		this.latoMinore = latoMinore;
		this.latoMaggiore = latoMaggiore;
	}
	
	public double perimetro() {
		return this.latoMaggiore * 2 + this.latoMinore * 2;
	}

	public double area() {
		return this.latoMaggiore * this.latoMinore;
	}
	
	public static void stampaRettangolo(Rettangolo r) {
		System.out.println("Area: " + r.area());
		System.out.println("Perimetro: " + r.perimetro());
	}
	
	public static void stampaRettangoli(Rettangolo r1, Rettangolo r2) {
		stampaRettangolo(r1);
		stampaRettangolo(r2);
		System.out.println("somma area rettangoli: " + (r1.area() + r2.area()));
		System.out.println("somma perimetro rettangoli: " + (r1.perimetro() + r2.perimetro()));
	}
}
