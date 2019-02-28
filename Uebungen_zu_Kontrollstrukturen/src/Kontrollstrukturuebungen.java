
public class Kontrollstrukturuebungen {

	//variables
	static String beliebigerString;
	static int eineZahl;
	static int nochEineZahl;
	static int ergebnis;
	static float eineZahlMitKomma;
	static int fibonacciZahl = 1;
	static int elementEins = 1;
	static int elementZwei = 1;
	static int unvorhandenesElement;
	static int testElement;
	
	
	public static void main(String[] args) {
		
		variablenfüllung();
		fibonacci();
		
		// TODO Auto-generated method stub

	}
	
	static public void variablenfüllung()
	{
		eineZahl = 6;
		nochEineZahl = 3;
		eineZahlMitKomma = 10;
		rechenspiele();
	}
	
	static public void rechenspiele()
	{
		ergebnis = eineZahl * nochEineZahl;
		if ( ergebnis > eineZahlMitKomma )

			{
			System.out.println( ergebnis - eineZahlMitKomma );
			}
		else
			System.out.println( "Das Ergebnis ist zu klein" );
	}
	
	static public void ungerade( int ende )
	{
		for ( int i = 1; i <= ende; i = i+2 )
		{
			System.out.println( i );
		}
	}
	
	static public void fibonacci()
	{
		while ( elementZwei - elementEins <= 500 )
			{
				unvorhandenesElement = elementZwei;
				elementZwei = elementEins + elementZwei;
				elementEins = unvorhandenesElement;
				System.out.println( elementZwei );
			
			}
		testElement = elementZwei - elementEins;
		System.out.println("UUUND " + testElement); //Gibt Unterschied zwischen 
	}
	
	
	
}
