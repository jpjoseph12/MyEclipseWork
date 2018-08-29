import java.util.ArrayList;

public class Paint {
	private double price;
	private String name;
	private double coverage;
	private int litres;
	
	ArrayList <Paint> paints = new ArrayList<Paint>();

	

	
	public Paint (String name, double price, double coverage, int litres) {
		this.name = name;
		this.price = price;
		this.coverage = coverage;
		this.litres = litres;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public double getCoverage() {
		return coverage;
	}

	public int getLitres() {
		return litres;
	}

	




	
}
