class Pillow
{
String brand = "Sleepwell";
String type = "small";
int quantity = 2;
double cost = 500;

{
System.out.println("Start of the program");
}
public static void main(String[] args)
{
	Pillow ref = new Pillow();
System.out.println(ref.brand);
System.out.println(ref.type);
System.out.println(ref.quantity);
System.out.println(ref.cost);

ref.brand = "Linen Affairs Sleeping Pillow";
ref.type = "small";
ref.quantity = 1;
ref.cost = 400;
System.out.println(ref.brand);
System.out.println(ref.type);
System.out.println(ref.quantity);
System.out.println(ref.cost);

ref.brand = "Wakewell Premium Fibre Soft Pillow";
ref.type = "large";
ref.quantity = 2;
ref.cost = 1000;
System.out.println(ref.brand);
System.out.println(ref.type);
System.out.println(ref.quantity);
System.out.println(ref.cost);

ref.brand = "Wakefit Pregnancy Pillow";
ref.type = "normal";
ref.quantity = 2;
ref.cost = 400;
System.out.println(ref.brand);
System.out.println(ref.type);
System.out.println(ref.quantity);
System.out.println(ref.cost);

ref.brand = "Rylan Memory Foam Pillow";
ref.type = "small";
ref.quantity = 3;
ref.cost = 500;
System.out.println(ref.brand);
System.out.println(ref.type);
System.out.println(ref.quantity);
System.out.println(ref.cost);

ref.brand = "Microfiber Cloud Pillow";
ref.type = "large";
ref.quantity = 2;
ref.cost = 600;
System.out.println(ref.brand);
System.out.println(ref.type);
System.out.println(ref.quantity);
System.out.println(ref.cost);

ref.brand = "Zovali Standard Pillow";
ref.type = "medium";
ref.quantity = 4;
ref.cost = 700;
System.out.println(ref.brand);
System.out.println(ref.type);
System.out.println(ref.quantity);
System.out.println(ref.cost);
}
}