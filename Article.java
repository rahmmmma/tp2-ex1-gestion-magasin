package magasin;

public class Article {
	protected int numInventaire;
    protected String designation;
    protected String couleur;
    protected double prix;
    protected String famille;

    public Article(int numInventaire, String designation, String couleur,
                   double prix, String famille) {
        this.numInventaire = numInventaire;
        this.designation = designation;
        this.couleur = couleur;
        this.prix = prix;
        this.famille = famille;
    }

    public String getFamille() {
        return famille;
    }

    @Override
    public String toString() {
        return "Article [numInventaire=" + numInventaire
                + ", designation=" + designation
                + ", couleur=" + couleur
                + ", prix=" + prix
                + ", famille=" + famille + "]";
    }

    public boolean memeFamille(Article a) {
        return this.famille.equalsIgnoreCase(a.famille);
    }

}
