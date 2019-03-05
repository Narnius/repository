
public class Passwortchecker {
	
	static int erfullteBedingungen = 0;
	static char[] charArray;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passwortChecker("l0l");
	}
	
	
	public static void passwortChecker(String passwort)
	{
		System.out.println(passwort);
		charArray = passwort.toCharArray();
		System.out.println(charArray[2] + " ist das dritte Zeichen des Passwortes");
		System.out.println();
		
		if (verschachtelung())
		{
			System.out.println("Dein Passwort ist sicher!");
		}
		else
		{
			System.out.println("Dein Passwort ist NICHT sicher!");
		}
	}
	
	
	public static boolean verschachtelung()
	{
		if (laenge() == false)
		{
			
		 	return false;
		}
		
		if (großbuchstabeVorhanden())
		{
			erfullteBedingungen = erfullteBedingungen + 1;
	    }
		else
		{
			System.out.println("Füge mindestens einen Großbuchstaben hinzu!");
		}
		
		if (kleinbuchstabeVorhanden())
		{
			erfullteBedingungen = erfullteBedingungen + 1;
	    }
		else
		{
			System.out.println("Füge mindestens einen Kleinbuchstaben hinzu!");
		}
		
		if (zifferVorhanden())
		{
			erfullteBedingungen = erfullteBedingungen + 1;
	    }
		else
		{
			System.out.println("Füge mindestens eine Ziffer/Zahl hinzu!");
		}
		
		if (sonderzeichenVorhanden())
		{
			erfullteBedingungen = erfullteBedingungen + 1;
	    }
		else
		{
			System.out.println("Füge mindestens ein Sonderzeichen hinzu!");
		}
		
		if (erfullteBedingungen >= 3)
		{
		 	return true;
		}
		
		else
			
		{
			return false;
		}
    }
	
	
	public static boolean laenge()
	{
		if (charArray.length >= 8)
		{
		 	return true;
		}
			else
		{
			return false;
	    }
    }
		
		public static boolean großbuchstabeVorhanden()
		{
			int anzahlGroßbuchstaben = 0;
			anzahlGroßbuchstaben = 0;
			
			for (int i = 0; i < charArray.length; i++)
			{
				if (Character.isUpperCase(charArray[i]))
				{
					//System.out.println(charArray[i] + " ist GROß!");
					anzahlGroßbuchstaben = anzahlGroßbuchstaben + 1;
				}
				
		}
			if (anzahlGroßbuchstaben > 0)
			{
			 	return true;
			}
				else
			{
				return false;
		    }
		
	}
		
		public static boolean kleinbuchstabeVorhanden()
		{
			int anzahlKleinbuchstaben = 0;
			anzahlKleinbuchstaben = 0;
			
			for (int i = 0; i < charArray.length; i++)
			{
				if (Character.isLowerCase(charArray[i]))
				{
					//System.out.println(charArray[i] + " ist klein!");
					anzahlKleinbuchstaben = anzahlKleinbuchstaben + 1;
				}
				
		}
			if (anzahlKleinbuchstaben > 0)
			{
			 	return true;
			}
				else
			{
				return false;
		    }
		
	}
		
		public static boolean zifferVorhanden()
		{
			int anzahlZiffern = 0;
			anzahlZiffern = 0;
			
			for (int i = 0; i < charArray.length; i++)
			{
					if (Character.isDigit(charArray[i]))
					{
						//System.out.println(charArray[i] + " ist eine Ziffer!");
						anzahlZiffern = anzahlZiffern + 1;
					}
				
		}
			if (anzahlZiffern > 0)
			{
			 	return true;
			}
				else
			{
				return false;
		    }
		}
			
			
			public static boolean sonderzeichenVorhanden()
			{
				int anzahlSonderzeichen = 0;
				anzahlSonderzeichen = 0;
				
				for (int i = 0; i < charArray.length; i++)
				{
					if (!Character.isLetterOrDigit(charArray[i]))
					{
						//System.out.println(charArray[i] + " ist ein Sonderzeichen!");
						anzahlSonderzeichen = anzahlSonderzeichen + 1;
					}
					
			}
				if (anzahlSonderzeichen > 0)
				{
				 	return true;
				}
					else
				{
					return false;
			    }
			
		}
		
}
