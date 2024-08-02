class Kitchen{
static double SouthIndianPrice = 90;
static double NorthIndianPrice = 120;
static double ComboPrice = 150;
static double iceCream = 50;
static double coffee = 15;
static double AlooPrice = 70;
static double Biriyani = 200;
static double Samosa = 20;


public static double counter(String price)
{
	if (price =="SouthIndian")
	{
		

		return SouthIndianPrice;
	}
	if (price == "comboOffer SouthIndian")
	{
		double totalCost = SouthIndianPrice+ComboPrice;
		return totalCost;
	}
	if (price == "comboOffer SouthIndian iceCream")
	{
		double totalCost1 = SouthIndianPrice+ComboPrice+iceCream;
		return totalCost1;
	}
	if (price == "comboOffer SouthIndian iceCream coffee")
	{
		double bill = SouthIndianPrice+ComboPrice+iceCream+coffee;
		return bill;
	}
	if (price =="NorthIndian")
	{
		
		return NorthIndianPrice;
	}
	if (price =="NorthIndian Aloo Paratha")
	{
		double bill = NorthIndianPrice+AlooPrice;
		return bill;
	}
	if (price =="NorthIndian Aloo Paratha Biriyani")
	{
				double bill1 = NorthIndianPrice+AlooPrice+Biriyani;
				return bill1;

	}
	if (price =="NorthIndian Aloo Paratha Biriyani Samosa")
	{
				double Finalbill = NorthIndianPrice+AlooPrice+Biriyani+Samosa;
				return Finalbill;

	}
	return 0;
}
public static void main (String[] args)
{
        double totalCost = counter("comboOffer SouthIndian");
        System.out.println("Total cost: " + totalCost);
}
}