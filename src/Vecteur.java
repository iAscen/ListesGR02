public class Vecteur {
    private int[] tableau;
    private int nbElements;
    private static final int RATIO_AGRANDISSEMENT = 2;
    private static final int TAILLE_INITIALE = 5;

    public Vecteur() {
        tableau = new int[TAILLE_INITIALE];
        nbElements = 0;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < nbElements; i++)
            str += tableau[i] + ", ";
        return str + "]";
    }

    public void ajouter(int valeur) {
        if (nbElements >= tableau.length)
            resize();
        tableau[nbElements++] = valeur;
    }

    private void resize() {
        //TODO Agrandir le vecteur
    }
}
