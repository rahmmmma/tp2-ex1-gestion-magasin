package magasin;
import java.util.Scanner;
public class testMagasin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Capacité du magasin : ");
        int cap = sc.nextInt();
        Magasin m = new Magasin(cap);

        for (int i = 0; i < cap; i++) {
            System.out.println("\n--- Article " + (i + 1) + " ---");
            System.out.print("Type (1 = Article simple, 2 = Article en lot) : ");
            int type = sc.nextInt();

            System.out.print("Numéro d'inventaire : ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.print("Désignation : ");
            String des = sc.nextLine();
            System.out.print("Couleur : ");
            String coul = sc.nextLine();
            System.out.print("Prix : ");
            double prix = sc.nextDouble();
            sc.nextLine();
            System.out.print("Famille : ");
            String fam = sc.nextLine();

            if (type == 2) {
                System.out.print("Nombre de pièces du lot : ");
                int nb = sc.nextInt();
                m.Ajout(new Article_Lot(num, des, coul, prix, fam, nb));
            } else {
                m.Ajout(new Article(num, des, coul, prix, fam));
            }
        }

        System.out.println("\n===== INVENTAIRE =====");
        m.Inventaire();
        sc.close();
	
	}

}
