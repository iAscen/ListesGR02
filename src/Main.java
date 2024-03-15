public class Main {
    public static void main(String[] args) {
        Vecteur data = new Vecteur();
        System.out.println(data.getNbElements());
        System.out.println(data.estVide());

        System.out.println("Test 1: Ajout de valeurs dans le vecteur");
        data.ajouter(0);
        data.ajouter(2);
        data.ajouter(4);
        System.out.println(data);
        System.out.println(data.getNbElements());
        System.out.println(data.estVide());

        System.out.println("Test 2: Agrandir le vecteur quand il est plein");
        data.ajouter(6);
        data.ajouter(8);
        data.ajouter(10);
        System.out.println(data);
        System.out.println(data.getNbElements());

        System.out.println("Test 3: Ajouter des valeurs à des index spécifiques");
        data.ajouter(-1, 0);
        data.ajouter( 5, 4);
        data.ajouter(11, 8);
        System.out.println(data);
        System.out.println(data.getNbElements());

        System.out.println("Test 4: Ajouter des valeurs provenant d'un autre vecteur");
        Vecteur v2 = new Vecteur();
        v2.ajouter(50);
        v2.ajouter(60);
        v2.ajouter(70);
        data.ajouter(v2);
        System.out.println(data);
        System.out.println(data.getNbElements());

        System.out.println("Test 5: Ajouter des valeurs provenant d'un autre vecteur (vide)");
        Vecteur v3 = new Vecteur();
        data.ajouter(v3);
        System.out.println(data);
        System.out.println(data.getNbElements());

        System.out.println("Test 6: Valider les valeurs présentes dans le vecteur");
        System.out.println(data.getElementAt(0));
        System.out.println(data.getElementAt(6));
        System.out.println(data.getElementAt(11));
    }
}
