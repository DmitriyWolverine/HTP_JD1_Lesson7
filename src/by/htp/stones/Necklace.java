package by.htp.stones;

public class Necklace {
	private double totalPriceOfStones;
	private int totalWeight = 1000;
	private Stone[] stones;
	
	public Necklace(Stone[] stones, int numberOfStones) {
		this.stones = new Jewel[numberOfStones];
		for(int i = 0 ; i < numberOfStones ; ++i) {
			this.stones[i] = new Jewel();
		}
		chooseStones( stones ,numberOfStones);
		for(int i = 0 ; i < this.stones.length  ; ++i) {
			totalWeight += this.stones[i].getWeight();
			totalPriceOfStones += this.stones[i].getPrice();
		}
	}
	
	private void chooseStones(Stone[] stones, int numberOfStones) {
		if(stones==null ) {
			return ;
		}
		int j = 0;
		for(int i = 0 ; i < stones.length && j < numberOfStones ; ++i) {
			if( stones[i] instanceof Jewel) {
				this.stones[j] = stones[i];
				j++;
			}
		}
	}
	
	public void printStonesWithInterestingTransparency(double firstBorder, double secondBorder) {
		if(firstBorder< 0 || firstBorder > secondBorder ||  secondBorder>1) {
			return;
		}
		HalfJewel [] temp = new HalfJewel[stones.length];
		for( int i = 0 ; i < stones.length ; ++i) {
			temp[i] = (HalfJewel) stones[i];
		}
		
		for( int i = 0 ; i < stones.length ; ++i) {
			 if ( temp[i].getTransparency() >= firstBorder && temp[i].getTransparency() <= secondBorder ) {
				 System.out.println(temp[i]);
			 }
		}
	}
	
	public void sortStonesByPrice() {
		for( int i = 0 ; i < stones.length - 1 ; i++ ) {
			int localMaxInd = i;
		
			for( int j = localMaxInd + 1; j < stones.length ; j++) {
				
				if( stones[j].getPrice() >= stones[localMaxInd].getPrice() ) {
					localMaxInd = j;
				}
			}
			swap(stones, i, localMaxInd);
		}
	}
	
	private static void swap (Stone[] array, int i , int j) {
		Stone temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void printStones() {
		for(int i = 0 ; i < stones.length; i++)
		{
			System.out.println(stones[i]);
		}
	}

	public double getTotalPriceOfStones() {
		return totalPriceOfStones;
	}

	public void setTotalPriceOfStones(double totalPriceOfStones) {
		this.totalPriceOfStones = totalPriceOfStones;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	public Stone[] getStones() {
		return stones;
	}

	public void setStones(Stone[] stones) {
		this.stones = stones;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = String.format("There are %d stones; Total weight is %d;  Total price of Stones is %.2f",
				stones.length, totalWeight, totalPriceOfStones);
		return str;
	}
}