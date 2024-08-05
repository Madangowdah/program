class RocketRunner
{
public static void main(String[] args)
{
Rocket rocket = new Rocket(9000);
rocket.noOfThrusters = 1222;
rocket.setCountry("India");
rocket.result();
System.out.println("<><><><><><><><><><><><><><><><><>");
Rocket rocket1 = new Rocket(10000);
rocket1.noOfThrusters = 122;
rocket1.setCountry("America");
rocket1.result();
}
}