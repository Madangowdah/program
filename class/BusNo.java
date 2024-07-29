class BusNo{

public static void main(String[] args){

String no1 = "KA40 F800";
String no2 = "KA40 F806";
String no3 = "KA40 F799";
String no4 = "KA40 F803";
String no5 = "KA40 F8798";

String[] nos = {no1,no2,no3,no4,no5};


for(int name=4;name<nos.length;name--)
{
	String ref = nos[name];
	System.out.println("The bus no is given as :"+ref);
	
}
System.out.println("end");
}
}