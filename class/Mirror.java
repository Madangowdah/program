class Mirror
{
int cost = 200;
byte quantity = 5;
String design = "circle";
String size = "1 meter";
String type = "plane";
{
	System.out.println("Start of the program");
}
public static void main(String[] args)
{
	Mirror ref = new Mirror();
	System.out.println(ref.cost);
	System.out.println(ref.quantity);
	System.out.println(ref.design);
	System.out.println(ref.size);
	System.out.println(ref.type);
	
	Mirror ref1 = new Mirror();
	ref1.cost = 500;
	ref1.quantity = 12;
	ref1.design = "square";
	ref1.size = "2 meter";
	ref1.type = "rotating";
	System.out.println(ref1.cost);
	System.out.println(ref1.quantity);
	System.out.println(ref1.design);
	System.out.println(ref1.size);
	System.out.println(ref1.type);
	
	ref1.cost = 5000;
	ref1.quantity = 1;
	ref1.design = "rectangle";
	ref1.size = "0.5 meter";
	ref1.type = "inclined";
	System.out.println(ref1.cost);
	System.out.println(ref1.quantity);
	System.out.println(ref1.design);
	System.out.println(ref1.size);
	System.out.println(ref1.type);
	
	ref1.cost = 1500;
	ref1.quantity = 22;
	ref1.design = "oval";
	ref1.size = "3 meter";
	ref1.type = "Spherical";
	System.out.println(ref1.cost);
	System.out.println(ref1.quantity);
	System.out.println(ref1.design);
	System.out.println(ref1.size);
	System.out.println(ref1.type);
	
	ref1.cost = 510;
	ref1.quantity = 5;
	ref1.design = "normal";
	ref1.size = "0.8 meter";
	ref1.type = "concave";
	System.out.println(ref1.cost);
	System.out.println(ref1.quantity);
	System.out.println(ref1.design);
	System.out.println(ref1.size);
	System.out.println(ref1.type);
	
	ref1.cost = 800;
	ref1.quantity = 10;
	ref1.design = "modern";
	ref1.size = "4 meter";
	ref1.type = "convex";
	System.out.println(ref1.cost);
	System.out.println(ref1.quantity);
	System.out.println(ref1.design);
	System.out.println(ref1.size);
	System.out.println(ref1.type);
	
	ref1.cost = 1000;
	ref1.quantity = 7;
	ref1.design = "standard";
	ref1.size = "2.5 meter";
	ref1.type = "curved";
	System.out.println(ref1.cost);
	System.out.println(ref1.quantity);
	System.out.println(ref1.design);
	System.out.println(ref1.size);
	System.out.println(ref1.type);
}
}