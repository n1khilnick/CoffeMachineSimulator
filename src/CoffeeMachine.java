import java.util.HashMap;

public class CoffeeMachine {
   private int money;
   private HashMap<String,Integer> ingredients;
   private HashMap<String,Integer> coffeesSold;

    public CoffeeMachine() {
        this.money = 0;
        ingredients = new HashMap<>();
        ingredients.put("water",0);
        ingredients.put("milk",0);
        ingredients.put("beans",0);
        coffeesSold = new HashMap<>();
    }

    public void buyCoffee(String coffeeType){
        int waterRequired, milkRequired, beansRequired, price;

        switch (coffeeType) {
            case "espresso" -> {
                waterRequired = 250;
                milkRequired = 0;
                beansRequired = 16;
                price = 4;
            }
            case "latte" -> {
                waterRequired = 350;
                milkRequired = 75;
                beansRequired = 20;
                price = 7;
            }
            case "cappuccino" -> {
                waterRequired = 200;
                milkRequired = 100;
                beansRequired = 12;
                price = 6;
            }
            default -> {
                System.out.println("Invalid coffee type!");
                return;
            }
        }

        if(ingredients.get("water") < waterRequired || ingredients.get("milk") < milkRequired || ingredients.get("beans") < beansRequired){
            System.out.println("Apologies, but we don't have enough ingredients available to make an "+coffeeType+" right now.");
        }
        else {
            System.out.println("Here's your "+coffeeType+". Enjoy your coffee!");
            money += price;

            // used the ingredients
            ingredients.put("water",ingredients.get("water") - waterRequired);
            ingredients.put("milk",ingredients.get("milk") - milkRequired);
            ingredients.put("beans",ingredients.get("beans") - beansRequired);

            int count = coffeesSold.getOrDefault(coffeeType,0);
            coffeesSold.put(coffeeType,count+1);
        }
    }

    public void fillIngredients(String ingredient, int amount) {
        if (ingredients.containsKey(ingredient)) {
            int currentAmount = ingredients.get(ingredient);
            ingredients.put(ingredient, currentAmount + amount);
            System.out.println("Added " + amount + " ml of " + ingredient + ".");
        } else {
            System.out.println("Invalid ingredient!");
        }
    }

    public void takeMoney() {
        System.out.println("Money collected: $" + money);
        System.out.println();
//        money = 0;
    }

    public void showIngredients() {
        System.out.println("Ingredients available:");
        for (HashMap.Entry<String, Integer> entry : ingredients.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ml");
        }
        System.out.println();
    }

    public void showAnalytics() {
        System.out.println("Coffee Sales Analytics:");
        for (HashMap.Entry<String, Integer> entry : coffeesSold.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " cups");
        }
//        money
        System.out.println("Total earnings: $" + money);
        System.out.println();
    }

}

