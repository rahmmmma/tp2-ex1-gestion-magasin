# tp2-ex1-gestion-magasin
taveaux pratique
nom : Rahma Hayder
nom: Loujayn Saoud
## Diagramme de classes UML


classDiagram
    class Article {
        #int numInventaire
        #String designation
        #String couleur
        #double prix
        #String famille
        +Article(int, String, String, double, String)
        +toString() String
        +memeFamille(Article) boolean
    }
    class Article_Lot {
        -int nbPieces
        +Article_Lot(int, String, String, double, String, int)
        +toString() String
    }
    class Magasin {
        -int capacite
        -Article[] stock
        -int nbArticle
        +Magasin(int)
        +Ajout(Article) void
        +Inventaire() void
    }
    class TestMagasin {
        +main(String[]) void
    }
    Article <|-- Article_Lot
    Magasin o-- Article
    TestMagasin ..> Magasin
