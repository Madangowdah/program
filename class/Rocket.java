class Rocket
{
String country;
long speed;
double fuelCapacity = 500;
int noOfThrusters;

Rocket(long speed)
{
	this.speed = speed;
}
public void setCountry(String country)
{
	this.country = country;
}
public void result()
{
	System.out.println("The rocket country is :"+country);
	System.out.println("The rocket speed is :"+speed);
	System.out.println("The rocket fuelCapacity is :"+fuelCapacity);
	System.out.println("The rocket noOfThrusters is :"+noOfThrusters);

}
}