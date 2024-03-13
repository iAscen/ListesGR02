public class Vecteur {
    private int[] tableau;
    private int nbElements;
    private static final int RATIO_AGRANDISSEMENT = 2;
    private static final int TAILLE_INITIALE = 4;

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

    public void ajouter(int valeur, int index) {
        if (nbElements == tableau.length)
            resize();
        for (int i = nbElements; i > index; i--)
            tableau[i] = tableau[i - 1];
        tableau[index] = valeur;
        nbElements++;
    }

    private void resize() {
        int[] nouveau = new int[RATIO_AGRANDISSEMENT * tableau.length];
        for (int i = 0; i < nbElements; i++)
            nouveau[i] = tableau[i];
        tableau = nouveau;
    }
}
