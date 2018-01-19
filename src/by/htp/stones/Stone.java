package by.htp.stones;

public class Stone {
	private String type;
	private double weight;
	private double price = 0;
	
	public Stone() {
		type = "Useless stone";
		weight = 500;
	}
	
	public Stone(String type, double weight) {
		this.type = type;
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return type + ", it's weight = "+(int)weight+ " carats";
	}
	
}