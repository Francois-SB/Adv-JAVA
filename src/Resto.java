/*
 * Crash 2nde cmd
 * résumé cmd x
 * cmd x
 */




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Resto {
static String[] ENTREE= {"entrée", "Salade", "Soupe", "quiche", "aucune"};
static String[] PLATS= {"plats", "poulet", "boeuf", "poisson", "vegetarien", "vegan", "aucun"};
static String[] ACCOMPAGNEMENTS= {"accompagnements", "riz", "pates", "frites", "legumes", "aucun"};
static String[] BOISSONS= {"boisssons", "eau plate", "eau gazzzeuzze", "soda", "vin", "aucune"};
static String[] DESSERTS= {"desserts", "tarye maison", "mousse au chocolat", "tiramisu", "aucun"};

	public static void main(String[] args) {
		int nbCommande=0;
		String input="";
		Scanner scan = new Scanner(System.in);//Init Scanner
		int []choix= new int[10];
		int choixFlag=0;
		String monFichier="menu.txt";
		
		
		System.out.println("Bonjour combien de menus souhaitez vous ?");
		input = scan.next();
		nbCommande=Integer.parseInt(input);
		
		for(int i=0;i<nbCommande;i++) {// V2 - prendre commande (void choix[choixFlag]=commander(scannner, string tab);
			choixFlag=0;//reset for new purshase
			System.out.println("Commande numero : "+(i+1));
			afficherMenu(ENTREE);
			input = scan.next();
			choix[choixFlag]=Integer.parseInt(input);
			++choixFlag;
			afficherMenu(PLATS);
			input = scan.next();
			choix[choixFlag]=Integer.parseInt(input);
			++choixFlag;
			afficherMenu(ACCOMPAGNEMENTS);
			input = scan.next();
			choix[choixFlag]=Integer.parseInt(input);
			++choixFlag;
			afficherMenu(BOISSONS);
			input = scan.next();
			choix[choixFlag]=Integer.parseInt(input);
			++choixFlag;
			afficherMenu(DESSERTS);
			input = scan.next();
			choix[choixFlag]=Integer.parseInt(input);
			++choixFlag;
			System.out.println("Résumé commande "+(i+1)+" :");//resuma cmd 1
			System.out.println("["+ENTREE[choix[0]]+", "+PLATS[choix[1]]+", "+ACCOMPAGNEMENTS[choix[2]]+", "+BOISSONS[choix[3]]+", "+DESSERTS[choix[4]]+"]");
			System.out.println();
			ecrireMenu(monFichier,choix,i);//ecrire le menu dans le fichier une fois le choix fait
			

		}
		System.out.println("Merci pour votre commande.");
		afficherMenu(monFichier);//afficher tout le fichier contenu par menus
		effacerMenu(monFichier);//efface le fichier
		scan.close();
	}
	public static void effacerMenu (String monfichier) {
		try {
			BufferedReader freader =  new BufferedReader(new FileReader(monfichier));
			BufferedWriter fwriter =  new BufferedWriter(new FileWriter(monfichier));
			String ligne ;
			while ((ligne=freader.readLine()) != null) {
				for(int i =1;i<ligne.length();i++)
				fwriter.write(" ");
			}
			
			freader.close();
			fwriter.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void ecrireMenu (String monfichier, int[] tab,int i) {
		try {
			BufferedWriter fichier =  new BufferedWriter(new FileWriter(monfichier,true));
			fichier.write("***************Résumé de la commande N°"+ String.valueOf(i+1) + "***************");
			
			
			fichier.newLine();
			fichier.write(ENTREE[tab[0]]);
			fichier.newLine();
			fichier.write(PLATS[tab[1]]);
			fichier.newLine();
			fichier.write(ACCOMPAGNEMENTS[tab[2]]);
			fichier.newLine();
			fichier.write(BOISSONS[tab[3]]);
			fichier.newLine();
			fichier.write(DESSERTS[tab[4]]);
			fichier.newLine();
			fichier.write("\n\n");
			fichier.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void afficherMenu (String monfichier) {
		try {
			BufferedReader fichier =  new BufferedReader(new FileReader(monfichier));
			String ligne ;
			while ((ligne=fichier.readLine()) != null) {
				System.out.println(ligne);
			}
			
			fichier.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void afficherMenu(String[] tab) {
		System.out.println("Choix "+tab[0]+" :");
		for(int i=1;i<tab.length;i++) {
			System.out.printf("[%-2d- %s]",i,tab[i]);
		}
		System.out.printf("\n");
		System.out.println("que souhaitez vous comme "+tab[0]+" ? [saisir le chiffre correspondant]");
	}

//	public static void afficherTab(String[] args) {
		
//	}
	
}
