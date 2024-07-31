class MugRunner
{
public static void main(String[] args)
{
	Mug mug = new Mug("YuBingo Innovative",200);
	mug.material = "ceramics";
	System.out.println("The mug company :"+mug.company);
	System.out.println("The mug type :"+mug.type);
	System.out.println("The mug cost :"+mug.cost);
	System.out.println("The mug material :"+mug.material);

	Mug mug1 = new Mug("Ceramic Magic Mug",275);
	mug1.material = "silver";
	System.out.println("The mug company :"+mug1.company);
	System.out.println("The mug type :"+mug1.type);
	System.out.println("The mug cost :"+mug1.cost);
	System.out.println("The mug material :"+mug1.material);
}
}