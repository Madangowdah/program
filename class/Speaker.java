class Speaker
{
String brand = "Boat";
String size;
double cost;
String output;

Speaker(String size)
{
	this.size = size;
}
public void setCost(double cost)
{
	this.cost = cost;
}
public void updates()
{
	System.out.println("the speaker brand is :"+brand);
	System.out.println("the speaker size is :"+size);
	System.out.println("the speaker cost is :"+cost);
	System.out.println("the speaker output is :"+output);

}
}