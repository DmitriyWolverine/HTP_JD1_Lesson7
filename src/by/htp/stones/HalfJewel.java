package by.htp.stones;

public class HalfJewel extends Stone{
	private double transparency;
	private boolean isRare;
	
	public HalfJewel() {
		super("HalfJEwel", 10 + (100 *  Math.random() ) );
		super.setPrice(10 + (100 * Math.random()) );
		this.transparency = Math.random();
		this.isRare = false;
	}
	
	public HalfJewel(String type, double weight, double transparency, boolean isRare) {
		super(type, weight);
		this.transparency = transparency;
		this.isRare = isRare;
	}

	public double getTransparency() {
		return transparency;
	}

	public void setTransparency(double transparency) {
		this.transparency = transparency;
	}

	public boolean isRare() {
		return isRare;
	}

	public void setRare(boolean isRare) {
		this.isRare = isRare;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		super.setPrice(500*Math.random());
	}

	@Override
	public String toString() {
		String res  = String.format("; Price is %.2f", super.getPrice());
		return super.toString() + res;
		//String s = String.format("Курс валют: %-4s%-8.4f  %-4s%-8.4f","USD", 58.4643, "EUR", 63.3695);
	}
}