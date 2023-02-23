import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		boolean isInt=false;
		double nombre=0;
		double testPair=0;
		String input;
		String jouer="Y";
		
		
		
		Scanner scan = new Scanner(System.in);//Init Scanner
		
		do {
		
			if (args.length>0) nombre=Double.parseDouble(args[0]);//chech and init if argument set with cmd
			else {
			
				do {
				System.out.println("Veuillez saisir un nombre");
				
				input = scan.next();
				
				isInt=isNumeric(input);//check the imput is Double
				} while (isInt==false);
				
				
			
			nombre=Double.parseDouble(input);
			}
			if (nombre>0) System.out.println("positif");
			else if (nombre==0) System.out.println("null");
			else System.out.println("négatif");
			testPair=nombre%2;
			
			if (testPair==0) System.out.println("pair");//if (nombre%2==0) System.out.println("pair")
			else if (testPair!=0) System.out.println("impair");
			else System.out.println("null");
			
			
			System.out.println("Voullez-vous faire une autre partie ? (Y/N)");
			jouer=scan.next();
			} while (jouer.equals("Y"));
		
		scan.close();
		System.out.println("fermeture du jeu");
		}

	public static boolean isNumeric(String input){
	    try{
	        double inputDbl = Double.parseDouble(input);
	        return true;
	    }
	    catch(NumberFormatException ex)
	    {
	        return false;
	    }
	}
		}

	





