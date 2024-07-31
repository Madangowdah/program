class WatchRunner
{

public static void main(String[] args)
{

Watch watch = new Watch("smart watch",1);
watch.cost = 2000;
System.out.println("the brand is :"+watch.brand);
System.out.println("the type is :"+watch.type);
System.out.println("the cost is :"+watch.cost);
System.out.println("the quantity is :"+watch.quantity);

Watch watch1 = new Watch("normal watch",2);
watch1.cost = 3000;
System.out.println("the brand is :"+watch1.brand1);
System.out.println("the type is :"+watch1.type);
System.out.println("the cost is :"+watch1.cost);
System.out.println("the quantity is :"+watch1.quantity);
}
}