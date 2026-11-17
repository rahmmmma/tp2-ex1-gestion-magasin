package magasin;

public class Article_Lot extends Article{
	private int nbPieces;

    public Article_Lot(int numInventaire, String designation, String couleur,
                       double prix, String famille, int nbPieces) {
        super(numInventaire, designation, couleur, prix, famille);
        this.nbPieces = nbPieces;
    }

    
    public String toString() {
        return super.toString() + " | Lot de " + nbPieces + " pièces";
    }

}
