class Metal
{
String name;
double cost;

Metal()
{
		System.out.println("Matal created without parameters");

}
Metal(String name)
{
	this.name = name;
		
	System.out.println("Matal created with the String");
	
}
Metal(int cost)
{
		this.cost = cost;
	
	System.out.println("Matal created with the double");
}
Metal(String name,int cost)
{
	this.name = name;
	this.cost = cost;
	
	System.out.println("Matal created with the String and double");
}
public static void main(String[] args)
{
	
	
	Metal metal = new Metal("Gold");
	System.out.println(metal.name);
	
	Metal metal1 = new Metal(7000);
	System.out.println(metal1.cost);
	
	Metal metal2 = new Metal("Silver",70000);
	System.out.println(metal2.name);
	System.out.println(metal2.cost);

	Metal metal3 = new Metal();
	metal3.name = "Platinum";
	metal3.cost = 100000;
	System.out.println(metal3.name);
	System.out.println(metal3.cost);

}
}