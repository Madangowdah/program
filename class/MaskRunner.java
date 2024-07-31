class MaskRunner
{
public static void main(String[] args)
{
	
	Mask mask = new Mask("Normal",5);
	mask.colour = "white";
	System.out.println("the mask type is :"+mask.type);
	System.out.println("the mask cost is :"+mask.cost);
	System.out.println("the mask colour is :"+mask.colour);
	System.out.println("the mask quantity is :"+mask.quantity);

	
	Mask mask1 = new Mask("A50",10);
	mask1.colour = "white";
	mask1.cost = 50;
	System.out.println("the mask type is :"+mask1.type);
	System.out.println("the mask cost is :"+mask1.cost);
	System.out.println("the mask colour is :"+mask1.colour);
	System.out.println("the mask quantity is :"+mask1.quantity);	
}
}