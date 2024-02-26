public class Vecteur {
    private int[] tableau;
    private int nbElements;
    private static final int RATIO_AGRANDISSEMENT = 2;
    private static final int TAILLE_INITIALE = 5;

    public Vecteur() {
        tableau = new int[TAILLE_INITIALE];
        nbElements = 0;
    }
}
