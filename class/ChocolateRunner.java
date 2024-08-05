class ChocolateRunner
{
public static void main(String[] print)
{
Chocolate chocolate = new Chocolate(10);
chocolate.manDate = "04/08/2024";
chocolate.setQuantity (4);
chocolate.bill();
System.out.println("<<====================================>>");
Chocolate chocolate1 = new Chocolate(50);
chocolate1.manDate = "04/07/2024";
chocolate1.setQuantity (10);
chocolate1.bill();	
}
}