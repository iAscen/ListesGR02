public class Main {
    public static void main(String[] args) {
        Vecteur data = new Vecteur();

        System.out.println("Test 1: Ajout de valeurs dans le vecteur");
        data.ajouter(0);
        data.ajouter(10);
        data.ajouter(20);
        System.out.println(data);

        System.out.println("Test 2: Agrandir le vecteur quand il est plein");
        data.ajouter(30);
        data.ajouter(40);
        data.ajouter(50);
        System.out.println(data);

        System.out.println("Test 3: Ajouter des valeurs à index spécifiques");
        data.ajouter(-10, 0);
        data.ajouter(25, 4);
        data.ajouter(60, 8);
        System.out.println(data);

        System.out.println("Test 4: Ajouter des valeurs provenant d'un autre vecteur");
        Vecteur v2 = new Vecteur();
        v2.ajouter(50);
        v2.ajouter(60);
        v2.ajouter(70);
        data.ajouter(v2);

        Vecteur v3 = new Vecteur();
        data.ajouter(v3);
        System.out.println(data);
    }
}
