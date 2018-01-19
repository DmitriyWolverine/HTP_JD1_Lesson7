package by.htp.stones;

public class Testing {

	public static void main(String[] args) {
		Stone [] stones = new Stone[100];
		for(int i = 0 ; i < 50; i++)
		{
			stones[i] = new Stone();
		}
		for(int i = 50 ; i < 75; i++)
		{
			stones[i] = new HalfJewel();
		}
		for(int i = 75 ; i < 100; i++)
		{
			stones[i] = new Jewel();
		}
		for(int i = 0 ; i < 100; i++)
		{
			System.out.println(stones[i]);
		}
		System.out.println("");
		Necklace necklace = new Necklace(stones, 10);
		necklace.printStonesWithInterestingTransparency(0.5, 0.9);
		System.out.println("");
		System.out.println(necklace);
		System.out.println("");
		necklace.printStones();
		System.out.println("");
		necklace.sortStonesByPrice();
		System.out.println("");
		necklace.printStones();
	}
}