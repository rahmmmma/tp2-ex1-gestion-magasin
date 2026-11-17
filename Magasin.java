package magasin;

public class Magasin {
	private int capacite;
    private Article[] stock;
    private int nbArticle;

    public Magasin(int capacite) {
        this.capacite = capacite;
        this.stock = new Article[capacite];
        this.nbArticle = 0;
    }

    public void Ajout(Article a) {
        if (nbArticle < capacite) {
            stock[nbArticle] = a;
            nbArticle++;
        } else {
            System.out.println("Stock plein : impossible d'ajouter l'article.");
        }
    }

    public void Inventaire() {
        if (nbArticle == 0) {
            System.out.println("Le stock est vide.");
            return;
        }
        for (int i = 0; i < nbArticle; i++) {
            System.out.println(stock[i].toString());
        }
    }

}
