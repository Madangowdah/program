class TrumpetRunner
{
public static void main(String[] args)
{
	Trumpet trumpet = new Trumpet("kansas",10000);
	trumpet.colour = "gold";
	System.out.println("The Trumpet company is :"+trumpet.company);
	System.out.println("The Trumpet type is :"+trumpet.type);
	System.out.println("The Trumpet cost is :"+trumpet.cost);
	System.out.println("The Trumpet colour is :"+trumpet.colour);

	Trumpet trumpet1 = new Trumpet("Boston Bb",14500);
	trumpet1.colour = "silver";
	trumpet1.type = "Bb Trumpet";
	System.out.println("The Trumpet company is :"+trumpet1.company);
	System.out.println("The Trumpet type is :"+trumpet1.type);
	System.out.println("The Trumpet cost is :"+trumpet1.cost);
	System.out.println("The Trumpet colour is :"+trumpet1.colour);	
}
}