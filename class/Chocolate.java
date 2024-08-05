class Chocolate
{
String name = "Dairy Milk";
double cost;
double quantity;
String manDate;

   Chocolate(double cost)
  {
	this.cost = cost;

  }
public void setQuantity(double quantity)
  {
	
  this.quantity=quantity;

  }
public void bill()
  {
	System.out.println("The name of the chocolate :"+name);
	System.out.println("The cost of the chocolate :"+cost);
	System.out.println("The quantity of the chocolate :"+quantity);
	System.out.println("The manDate of the chocolate :"+manDate);

  }
}