class SpeakerRunner
{
public static void main(String[] run)
{
Speaker speaker = new Speaker("medium");
speaker.output = "working";
speaker.setCost(5000);
speaker.updates();
System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
Speaker speaker1 = new Speaker("large");
speaker1.output = "Slitly problem";
speaker1.setCost(1000);
speaker1.updates();
}
}