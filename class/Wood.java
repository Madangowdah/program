class Wood
{
String name;
int range;
double cost;
boolean check;
char data;

{
	System.out.println("start");
}
public static void main(String[] args){
	
Wood qwe = new Wood();
System.out.println(qwe.name);
System.out.println(qwe.range);	
System.out.println(qwe.cost);
System.out.println(qwe.check);
System.out.println(qwe.data);
qwe.name = "java";
System.out.println(qwe.name);
System.out.println("the value is :"+qwe.data+  "end");

}
}
