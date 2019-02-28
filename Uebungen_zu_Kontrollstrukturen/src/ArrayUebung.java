import java.util.ArrayList;
import java.util.List;
public class ArrayUebung {

static List<String> wochentage = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tageDerWoche();
		nixMitFrei();
		wocheAusgeben();
	}
	
	static public void tageDerWoche()
	{
		wochentage.add("Montag");
		wochentage.add("Dienstag");
		wochentage.add("Mittwoch");
		wochentage.add("Donnerstag");
		wochentage.add("Freitag");
		wochentage.add("Samstag");
		wochentage.add("Sonntag");
	}
	
	static public void nixMitFrei()
	{
		wochentage.set(4, "Nochnichtfreitag");
	}
	
	static public void wocheAusgeben()
	{
		System.out.println(wochentage);
	}
	
	
	static public void monateDesJahres()
	{
		wochentage.add("Januar");
		wochentage.add("Februar");
		wochentage.add("Maerz");
		wochentage.add("April");
		wochentage.add("Mai");
		wochentage.add("Juni");
		wochentage.add("Juli");
		wochentage.add("August");
		wochentage.add("September");
		wochentage.add("Oktober");
		wochentage.add("November");
		wochentage.add("Dezember");
	}
	
	
	
}
