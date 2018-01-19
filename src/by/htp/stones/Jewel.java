package by.htp.stones;

public class Jewel extends HalfJewel{
	private String colour;
	
	public Jewel () {
		super();
		double temp = Math.random();
		super.setRare(true);
		super.setTransparency(0.5 + (temp /2 ));
		super.setWeight(1+ 25*temp);
		initName();
		initColour();
		super.setPrice( 1000+ 10000 * temp);
	}
	
	private void initName() {
		int number = (int) (4 * Math.random()) ;
		switch(number) {
			case 0:{
				super.setType("Diamond");
				break;
			}
			case 1:{
				super.setType("Sapphire");
				break;
			}
			case 2:{
				super.setType("Sardius");
				break;
			}
			default:{
				super.setType("Brilliant");
			}
		}
	}
	private void initColour() {
		int number = (int) (7 * Math.random()) ;
		switch(number) {
			case 0:{
				colour = "Red";
				break;
			}
			case 1:{
				colour = "Orange";
				break;
			}
			case 2:{
				colour = "Yeallow";
				break;
			}
			case 3:{
				colour = "Green";
				break;
			}
			case 4:{
				colour = "Blue";
				break;
			}
			case 5:{
				colour = "Indigo";
				break;
			}
			default:{
				colour = "Purple";
			}
		}
	}
	
	public Jewel(String type, double weight, double transparency, boolean isRare, double price) {
		super(type, weight, transparency, isRare);
		super.setPrice(price);
	}

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
}