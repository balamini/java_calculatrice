public class CalculetteSwitch{
	/**
	 * Class CalculetteSwitch. Contient main
	 * @author : BD
	 * @param args : arguments du main
	 *
	 */ 
	public static void main (String args[]){
		System.out.println("Nombre d'arguments : " + args.length );/* afficher les arguments de la ligne de commande */
		if (args.length != 3){
		System.out.println("Usage : Calculette entier1 {+, -, x, /} entier2");
		return;
		}
		for (int i=0 ; i<args.length ; i++){
			System.out.println("argument "+ i + " = " + args[i]);
		}
		System.out.print("Resultat : ");
		int entier1=Integer.parseInt(args[0]); //le static permet l'acces à la méthode ce fait via la class
		int entier2=Integer.parseInt(args[2]);
		char operateur=args[1].charAt(0);
		int resultat=0;
		switch (operateur){
			case ('+'):
			resultat=entier1 + entier2;
			break;
			case ('-'):
			resultat=entier1 - entier2;
			break;
			case ('/'):
			resultat=entier1 / entier2;
			break;
			case ('x'):
			resultat=entier1 * entier2;
			break;
		}
		System.out.println(entier1+" "+operateur+" "+entier2 + " = " + resultat);
	}
}

