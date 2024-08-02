class CoffeePowder
{
	String company;
	double cost;
	int weight;
	String mafDate;
	
	CoffeePowder()
	{
		System.out.println("CoffeePowder is created with zero parameter");
	}
		CoffeePowder(String company)
	{
		this.company = company;
		System.out.println("CoffeePowder is created with String");
	}
			CoffeePowder(String company,double cost,int weight,String mafDate)
	{
		this.company = company;
		this.cost = cost;
		this.weight = weight;
		this.mafDate = mafDate;
		System.out.println("CoffeePowder is created with String,double,int and String");
	}
			CoffeePowder(String company,String mafDate)
	{
		this.company = company;
		this.mafDate = mafDate;
		System.out.println("CoffeePowder is created with String");
	}
				CoffeePowder(int weight)
	{
		this.weight = weight;
		System.out.println("CoffeePowder is created with int");	

	}

public static void main(String[] args)
{
CoffeePowder coffeePowder = new CoffeePowder("Bru");	
System.out.println(coffeePowder.company);

CoffeePowder coffeePowder1 = new CoffeePowder("Kotas","02/08/2024");	
System.out.println(coffeePowder1.company);
System.out.println(coffeePowder1.mafDate);

CoffeePowder coffeePowder2 = new CoffeePowder("Malgudi",100,50,"02/08/2024");	
System.out.println(coffeePowder2.company);
System.out.println(coffeePowder2.mafDate);
System.out.println(coffeePowder2.cost);
System.out.println(coffeePowder2.weight);

CoffeePowder coffeePowder3 = new CoffeePowder(100);	
System.out.println(coffeePowder3.weight);
}	
}
