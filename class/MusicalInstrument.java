class MusicalInstrument{

String name;
String brand;
double cost;
int quantity;
String type;

public MusicalInstrument(){
	
	System.out.println("start the program");
}
public static void main(String[] run)
{
	
	MusicalInstrument ref = new MusicalInstrument();
	System.out.println(ref.name);
	System.out.println(ref.brand);
	System.out.println(ref.cost);
	System.out.println(ref.quantity);
	System.out.println(ref.type);
	
	MusicalInstrument ref1 = new MusicalInstrument();
	ref1.name = "Gitar";
	ref1.brand = "fender";
	ref1.cost = 5000;
	ref1.quantity = 1;
	ref1.type = "normal";
	System.out.println(ref1.name);
	System.out.println(ref1.brand);
	System.out.println(ref1.cost);
	System.out.println(ref1.quantity);
	System.out.println(ref1.type);
	
	MusicalInstrument	ref2 = new MusicalInstrument();
	ref2.name = "Gitar";
	ref2.brand = "Gibson";
	ref2.cost = 7000;
	ref2.quantity = 2;
	ref2.type = "normal";
	System.out.println(ref2.name);
	System.out.println(ref2.brand);
	System.out.println(ref2.cost);
	System.out.println(ref2.quantity);
	System.out.println(ref2.type);
	
		
	MusicalInstrument	ref4 = new MusicalInstrument();
	ref4.name = "Gitar";
	ref4.brand = "C. F. Martin & Company";
	ref4.cost = 4000;
	ref4.quantity = 1;
	ref4.type = "normal";
	System.out.println(ref4.name);
	System.out.println(ref4.brand);
	System.out.println(ref4.cost);
	System.out.println(ref4.quantity);
	System.out.println(ref4.type);
		
	MusicalInstrument	ref5 = new MusicalInstrument();
	ref5.name = "Gitar";
	ref5.brand = "Cort Guitars";
	ref5.cost = 9000;
	ref5.quantity = 1;
	ref5.type = "normal";
	System.out.println(ref5.name);
	System.out.println(ref5.brand);
	System.out.println(ref5.cost);
	System.out.println(ref5.quantity);
	System.out.println(ref5.type);
		
	MusicalInstrument	ref6 = new MusicalInstrument();
	ref6.name = "Gitar";
	ref6.brand = "Taylor";
	ref6.cost = 6000;
	ref6.quantity = 22;
	ref6.type = "moderate";
	System.out.println(ref6.name);
	System.out.println(ref6.brand);
	System.out.println(ref6.cost);
	System.out.println(ref6.quantity);
	System.out.println(ref6.type);
		
	MusicalInstrument	ref7 = new MusicalInstrument();
	ref7.name = "Gitar";
	ref7.brand = "yamaha";
	ref7.cost = 10000;
	ref7.quantity = 1;
	ref7.type = "standard";
	System.out.println(ref7.name);
	System.out.println(ref7.brand);
	System.out.println(ref7.cost);
	System.out.println(ref7.quantity);
	System.out.println(ref7.type);
		
}
}