class RadioRunner
{
public static void main(String[] args)
{

Radio radio = new Radio("boat",1000);
radio.quantity = 1;
System.out.println("the radio name :"+radio.name);
System.out.println("the radio type :"+radio.type);
System.out.println("the radio quantity :"+radio.quantity);
System.out.println("the radio cost :"+radio.cost);


Radio radio1 = new Radio("redmi",2000);
radio1.quantity = 2;
radio1.type = "advanced";
System.out.println("the radio1 name :"+radio1.name);
System.out.println("the radio1 type :"+radio1.type);
System.out.println("the radio1 quantity :"+radio1.quantity);
System.out.println("the radio1 cost :"+radio1.cost);
}
}