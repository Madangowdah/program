class CableRunner
{
public static void main(String[] args)
{
	Cable cable = new Cable("copper","single phase");
	cable.cost = 5000;
	System.out.println("the cable brand :"+cable.brand);
	System.out.println("the cable material :"+cable.material);
	System.out.println("the cable cost :"+cable.cost);
	System.out.println("the cable type :"+cable.type);

	
	Cable cable1 = new Cable("silver","three phase");
	cable1.cost = 3000;
	System.out.println("the cable brand :"+cable1.brand1);
	System.out.println("the cable material :"+cable1.material);
	System.out.println("the cable cost :"+cable1.cost);
	System.out.println("the cable type :"+cable1.type);
}

}