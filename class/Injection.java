class Injection
{
String company;
String name;
String type;
double cost;
int quantity;

public Injection()
{
	System.out.println("start of the program");
}
public static void main(String[] args)
{
	Injection injection = new Injection();
	System.out.println(injection.company);
	System.out.println(injection.name);
	System.out.println(injection.type);
	System.out.println(injection.cost);
	System.out.println(injection.quantity);
	
	Injection ref = new Injection();
	ref.name = "ACETAMINOPHEN injectable";
	ref.type = "small";
	ref.cost = 50;
	ref.quantity = 1;
	ref.company = "Iskon Remedies – Top Injection Manufacturer";
	System.out.println(ref.company);
	System.out.println(ref.name);
	System.out.println(ref.type);
	System.out.println(ref.cost);
	System.out.println(ref.quantity);

	Injection ref1 = new Injection();
	ref1.name = "ADRENALINE injectable ";
	ref1.type = "medium";
	ref1.cost = 20;
	ref1.quantity = 5;
	ref1.company = "GMT Pharma International";
	System.out.println(ref1.company);
	System.out.println(ref1.name);
	System.out.println(ref1.type);
	System.out.println(ref1.cost);
	System.out.println(ref1.quantity);
	
	Injection ref2 = new Injection();
	ref2.name = " AMOXICILLIN/CLAVULANIC ACID = CO-AMOXICLAV injectable";
	ref2.type = "small";
	ref2.cost = 10;
	ref2.quantity = 51;
	ref2.company = "Pacific India Pharma";
	System.out.println(ref2.company);
	System.out.println(ref2.name);
	System.out.println(ref2.type);
	System.out.println(ref2.cost);
	System.out.println(ref2.quantity);
	
	Injection ref3 = new Injection();
	ref3.name = "AMPHOTERICIN B conventional injectable";
	ref3.type = "small";
	ref3.cost = 50;
	ref3.quantity = 1;
	ref3.company = "Maksun Biotech";
	System.out.println(ref3.company);
	System.out.println(ref3.name);
	System.out.println(ref3.type);
	System.out.println(ref3.cost);
	System.out.println(ref3.quantity);

Injection ref4 = new Injection();
	ref4.name = "AMPHOTERICIN B liposomal injectable";
	ref4.type = "small";
	ref4.cost = 50;
	ref4.quantity = 1;
	ref4.company = "Sunwin Healthcare  ";
	System.out.println(ref4.company);
	System.out.println(ref4.name);
	System.out.println(ref4.type);
	System.out.println(ref4.cost);
	System.out.println(ref4.quantity);

Injection ref5 = new Injection();
	ref5.name = "AMPICILLIN injectable";
	ref5.type = "small";
	ref5.cost = 50;
	ref5.quantity = 1;
	ref5.company = "DM Pharma";
	System.out.println(ref5.company);
	System.out.println(ref5.name);
	System.out.println(ref5.type);
	System.out.println(ref5.cost);
	System.out.println(ref5.quantity);

Injection ref6 = new Injection();
	ref6.name = "ARTESUNATE injectable";
	ref6.type = "small";
	ref6.cost = 50;
	ref6.quantity = 1;
	ref6.company = "Biophar Lifesciences";
	System.out.println(ref6.company);
	System.out.println(ref6.name);
	System.out.println(ref6.type);
	System.out.println(ref6.cost);
	System.out.println(ref6.quantity);
}
}