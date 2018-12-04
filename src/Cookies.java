import java.util.Arrays;
import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBatches = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfBatches; i++) {
            boolean flour = false;
            boolean sugar = false;
            boolean eggs = false;
            String ingredient = scanner.nextLine();

            while(!(ingredient.equals("Bake!") && flour && sugar && eggs)) {
                if (ingredient.equals("Bake!")) {
                        System.out.println("The batter should contain flour, eggs and sugar!");
                    }

                switch (ingredient) {
                    case "flour":
                        flour = true;
                        break;
                    case "sugar":
                        sugar = true;
                        break;
                    case "eggs":
                        eggs = true;
                        break;
                    default:
                        break;
                }
                ingredient = scanner.nextLine();
            }
            System.out.println("Baking batch number " + i + "...");
        }
    }
}
