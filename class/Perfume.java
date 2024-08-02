class Perfume
{
	String brand;
	double price;
	int quantity;
	
	
	Perfume()
	{
		System.out.println("Perfume is created with zero-parameter");
	}
	Perfume(String brand)
	{
		this.brand = brand;
	
		System.out.println("Perfume is created with String");
	}
	Perfume(String brand,double price)
	{
		this.brand = brand;
		this.price = price;
		
		System.out.println("Perfume is created with String and double");
	}
	Perfume(String brand,double price,int quantity)
	{
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		
		System.out.println("Perfume is created with String,double and int");
	}
	public static void main(String[] args)
	{
		Perfume perfume = new Perfume();
		perfume.brand = "Fogg";
		perfume.price = 200;
		perfume.quantity = 1;
		System.out.println(perfume.brand);
		System.out.println(perfume.price);
		System.out.println(perfume.quantity);

		Perfume perfume1 = new Perfume("Engage");
		System.out.println(perfume1.brand);
		
		Perfume perfume2 = new Perfume("MAN Company",300);
		System.out.println(perfume2.brand);
		System.out.println(perfume2.price);
		
		Perfume perfume3 = new Perfume("Denver",250,2);
		System.out.println(perfume3.brand);
		System.out.println(perfume3.price);
		System.out.println(perfume3.quantity);
	}
}