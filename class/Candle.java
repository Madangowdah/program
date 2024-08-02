class Candle
{

double length;
double price;
String fragrance;

Candle()
{
	System.out.println("created candle with zero parameters");
}
Candle(double length)
{
	this.length=length;
	System.out.println("created candle with double");
}

Candle(String fragrance)
{
	this.fragrance=fragrance;
		System.out.println("created candle with string");

}
Candle(double length,String fragrance)
{
	this.length=length;
	this.fragrance=fragrance;
			System.out.println("created candle with double and string");

}
Candle(String fragrance,double price)
{
	this.price=price;
	this.fragrance=fragrance;
			System.out.println("created candle with double and string");

}
Candle(double length,double price)
{
	this.length=length;
	this.price=price;
	System.out.println("created candle with double and double");

}
Candle(double length,double price,String fragrance)
{
	this.length=length;
	this.price=price;
	this.fragrance=fragrance;
	System.out.println("created candle with double,double and string");

}
public static void main(String[] args)
{
	Candle candle = new Candle(5);
	System.out.println(candle.length);
	
}
}