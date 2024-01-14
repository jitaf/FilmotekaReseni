import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.print("Zadejte počet filmů: ");
        int pocetFilmu = scanner.nextInt();
        scanner.nextLine(); // Přečti zbývající nový řádek

        Film[] filmy = new Film[pocetFilmu];

        for (int i = 0; i < pocetFilmu; i++) {
            System.out.println("\nZadání informací o filmu č. " + (i + 1));

            System.out.print("Název filmu: ");
            String nazev = scanner.nextLine();

            System.out.print("Rok vydání: ");
            int rokVydani = scanner.nextInt();

            System.out.print("Hodnocení (0-100): ");
            int hodnoceni = scanner.nextInt();
            scanner.nextLine(); // Přečti zbývající nový řádek

            System.out.print("Počet herců ve filmu: ");
            int pocetHercu = scanner.nextInt();
            scanner.nextLine(); // Přečti zbývající nový řádek

            Herec[] herci = new Herec[pocetHercu];

            for (int j = 0; j < pocetHercu; j++) {
                System.out.println("\nZadání informací o herci č. " + (j + 1));

                System.out.print("Jméno herce: ");
                String jmenoHerci = scanner.nextLine();

                System.out.print("Rok narození herce: ");
                int rokNarozeniHerci = scanner.nextInt();
                scanner.nextLine(); // Přečti zbývající nový řádek

                herci[j] = new Herec(jmenoHerci, rokNarozeniHerci);
            }

            filmy[i] = new Film(nazev, rokVydani, hodnoceni, herci);
        }

        System.out.println("\nFilmy s hodnocením vyšším než 80:");
        for (Film film : filmy) {
            if (film.getHodnoceni() > 80) {
                System.out.println(film.getNazev());
            }
        }

        // Najdi nejlépe hodnocený film
        Film nejlepeHodnocenyFilm = filmy[0];
        for (Film film : filmy) {
            if (film.getHodnoceni() > nejlepeHodnocenyFilm.getHodnoceni()) {
                nejlepeHodnocenyFilm = film;
            }
        }

        System.out.println("\nNejlépe hodnocený film je: " + nejlepeHodnocenyFilm.getNazev());
    }
}