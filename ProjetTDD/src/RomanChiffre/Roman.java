package RomanChiffre;


public class Roman {

	public int decode(String Chaine){
		int Nb = 0;
		for (int i = 0; i < Chaine.length(); ++i)
		{
			switch (Chaine.charAt(i))
			{
				case 'I' :
					Nb += 1;
					break;
					
				case 'V' :
						if (i != 0 && Chaine.charAt(i-1) == 'I') {
							Nb += 3;
							break;
						}
						else {
							Nb += 5;
							break;
						}
						
				case 'X' :
						if (i != 0 && Chaine.charAt(i-1) == 'I') {
							Nb += 8;
							break;
						}
						else {
							Nb += 10;
							break;
						}
						
				case 'L' :
						if (i != 0 && Chaine.charAt(i-1) == 'X') {
							Nb += 30;
							break;
						}
						else {
							Nb += 50;
							break;
						}
						
				case 'C' :
						if (i != 0 && Chaine.charAt(i-1) == 'X') {
							Nb += 80;
							break;
						}
						else {
							Nb += 100;
							break;
						}
						
				case 'D' :
						if (i != 0 && Chaine.charAt(i-1) == 'C') {
							Nb += 300;
							break;
						}
						else {
							Nb += 500;
							break;
						}
						
				case 'M' :
						if (i != 0 && Chaine.charAt(i-1) == 'C') {
							Nb += 800;
							break;
						}
						else {
							Nb += 1000;
							break;
						}
				default:
					throw new ArithmeticException();
			}
		}
		return Nb;
	}
	
}
