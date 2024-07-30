class IronBox
{
String brand = "Philips";
String type = "normal";
int quantity = 1;
double cost = 1500;

{
System.out.println("Starting the program");
}
public static void main(String[] args)
{
	IronBox ref = new IronBox();
	System.out.println(ref.brand);
	System.out.println(ref.type);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.brand = "bajaj";
	ref.type = "steam";
	ref.quantity = 1;
	ref.cost = 500;
	System.out.println(ref.brand);
	System.out.println(ref.type);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.brand = "Orient electric";
	ref.type = "coal based";
	ref.quantity = 1;
	ref.cost = 400;
	System.out.println(ref.brand);
	System.out.println(ref.type);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.brand = "wipro";
	ref.type = "electricity";
	ref.quantity = 1;
	ref.cost = 1500;
	System.out.println(ref.brand);
	System.out.println(ref.type);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.brand = "havells";
	ref.type = "steam";
	ref.quantity = 1;
	ref.cost = 500;
	System.out.println(ref.brand);
	System.out.println(ref.type);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.brand = "usha";
	ref.type = "normal";
	ref.quantity = 2;
	ref.cost = 2000;
	System.out.println(ref.brand);
	System.out.println(ref.type);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);
	
	ref.brand = "rico";
	ref.type = "steam";
	ref.quantity = 1;
	ref.cost = 500;
	System.out.println(ref.brand);
	System.out.println(ref.type);
	System.out.println(ref.quantity);
	System.out.println(ref.cost);

}
}