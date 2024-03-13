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
    }
}
