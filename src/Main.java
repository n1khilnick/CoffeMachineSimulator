import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        while(true){
            System.out.println("Select an options :");
            System.out.println("1. Buy coffee");
            System.out.println("2. Fill ingredients");
            System.out.println("3. Take money");
            System.out.println("4. Show ingredients");
            System.out.println("5. Show analytics");
            System.out.println("6. Exit");

            int option = s.nextInt();


            switch (option) {
                case 1 -> {
                    System.out.println();
                    System.out.println("Please enter which type of Coffee you want ");
                    System.out.println("Espresso - 4$/cup ");
                    System.out.println("Latte - $7/cup ");
                    System.out.println("Cappuccino - $6/cup ");
                    System.out.println();
                    String coffeeType = s.next().toLowerCase();
                    coffeeMachine.buyCoffee(coffeeType);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println();
                    System.out.println("Enter ingredients");
                    System.out.println("Water/Milk/Beans");
                    String ingredient = s.next().toLowerCase();
                    s.nextLine();
                    System.out.println(ingredient+" selected");
                    System.out.println("Enter amount to fill (in ml):");
                    int amount = s.nextInt();
                    // for the newline character
                    coffeeMachine.fillIngredients(ingredient, amount);
                    System.out.println();
                }
                case 3 -> coffeeMachine.takeMoney();

                case 4 -> coffeeMachine.showIngredients();
                case 5 -> coffeeMachine.showAnalytics();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}