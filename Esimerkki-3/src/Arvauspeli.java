import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oikeaNimi = "Veikka";
        System.out.print("Arvaa nimeni: ");
        String arvaus = scanner.nextLine();

        if (arvaus.equalsIgnoreCase(oikeaNimi)) {
            System.out.println("Arvasit oikein!");
        } else {
            System.out.println("Oh.. U missed that one!! TRY ANOTHER!!!");
        }

        scanner.close();
    }
}
