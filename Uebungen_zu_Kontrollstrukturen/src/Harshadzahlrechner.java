public class Harshadzahlrechner {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		harshad(100);
	}

	public static int quersumme(int zahl)
	{
		if(zahl<=9) return zahl;
		return zahl % 10 + quersumme(zahl/10);
	}


	public static void harshad(int ende)
	{
		int ergebnis;
		for(int i = 10; i<=ende ; i++)
		{
			if(i % quersumme(i) == 0)
			{
				ergebnis = i / quersumme(i);
				System.out.print( "  " + i);
				System.out.println("       Ergebnis der Rechnung = " + ergebnis );
				System.out.println("");
			}
		}
	}

	
}
