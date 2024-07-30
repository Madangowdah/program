class Tubelight
{
	String company;
	int cost;
	int quantity;
	String color;
	String type;
	
	{
		System.out.println("start");
	}
	
	public static void main(String[] args)
	{
		Tubelight ref = new Tubelight();
		System.out.println(ref.company);
		System.out.println(ref.cost);
		System.out.println(ref.quantity);
		System.out.println(ref.color);
		System.out.println(ref.type);
		
		ref.company = "Galaxy lights";
		ref.cost = 100;
		ref.quantity = 2;
		ref.color = "white";
		ref.type = "Philips Tube Light";
		System.out.println(ref.company);
		System.out.println(ref.cost);
		System.out.println(ref.quantity);
		System.out.println(ref.color);
		System.out.println(ref.type);
		
		ref.company = "Hira industries";
		ref.cost = 50;
		ref.quantity = 3;
		ref.color = "grey";
		ref.type = "Surya Tube Light";
		System.out.println(ref.company);
		System.out.println(ref.cost);
		System.out.println(ref.quantity);
		System.out.println(ref.color);
		System.out.println(ref.type);

		ref.company = "Nucleus Electricals";
		ref.cost = 200;
		ref.quantity = 4;
		ref.color = "orange";
		ref.type = "PolyCab Tube Light";
		System.out.println(ref.company);
		System.out.println(ref.cost);
		System.out.println(ref.quantity);
		System.out.println(ref.color);
		System.out.println(ref.type);

		ref.company = "Havells";
		ref.cost = 50;
		ref.quantity = 5;
		ref.color = "red";
		ref.type = "Havells Tube Light";
		System.out.println(ref.company);
		System.out.println(ref.cost);
		System.out.println(ref.quantity);
		System.out.println(ref.color);
		System.out.println(ref.type);

		ref.company = "Syska LED Tube Light";
		ref.cost = 150;
		ref.quantity = 6;
		ref.color = "violet";
		ref.type = "wipro Tube Light";
		System.out.println(ref.company);
		System.out.println(ref.cost);
		System.out.println(ref.quantity);
		System.out.println(ref.color);
		System.out.println(ref.type);

		ref.company = "Electro Science";
		ref.cost = 250;
		ref.quantity = 7;
		ref.color = "blue";
		ref.type = "Eveready Tube Light";
		System.out.println(ref.company);
		System.out.println(ref.cost);
		System.out.println(ref.quantity);
		System.out.println(ref.color);
		System.out.println(ref.type);		
	}
}
