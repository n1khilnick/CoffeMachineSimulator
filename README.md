# Coffee Machine Simulator

This is a Coffee Machine Simulator implemented in Java, designed to manage a virtual coffee machine with various features. The simulator allows users to interact with the coffee machine through a REPL (Read, Eval, Print, Loop) console application.


## Features

1. **Buy Coffee:**
   Users can select different types of coffee and purchase them. Each coffee type has a specific price and requires certain amounts of ingredients. <br>
   The coffee types available are: <br>
   * Espresso:
     * Price: $4/cup
     * Water needed: 250 ml/cup
     * Milk needed: 0 ml/cup
     * Coffee beans needed: 16 beans/cup
     
   * Latte:
     * Price: $7/cup
     * Water needed: 350 ml/cup
     * Milk needed: 75 ml/cup
     * Coffee beans needed: 20 beans/cup
     
   * Cappuccino:
     * Price: $6/cup
     * Water needed: 200 ml/cup
     * Milk needed: 100 ml/cup
     * Coffee beans needed: 12 beans/cup

   The coffee machine will dispense the selected coffee only if it contains sufficient ingredients. Otherwise, an error message will be displayed.
<br>

2. **Fill Ingredients:**
   The simulator provides an option to add ingredients to the coffee machine. Users can specify the amounts of water, milk, and coffee beans to be added.

3. **Take Money:** The maintainer can use the "take" option to retrieve the money stored in the coffee machine's money box.

4. **Show Ingredients**: Users can check the current levels of ingredients available in the coffee machine.

5. **Exit:** The "exit" option stops the simulation and terminates the program.

#### Extension
The simulator includes an additional option called "Analytics" that provides useful information about the coffee machine's operations. The "Analytics" option displays the following:

* Total count of each type of coffee sold.
* Total amount of money earned.
* Total amounts of ingredients consumed.


## Examples:
```cmd
Welcome to the Coffee Machine Simulator!

Select an options :
1. Buy coffee 
2. Fill ingredients
3. System.out.println 
4. Show ingredients
5. Show analytics 
6. Exit. 

2
Enter ingredients
Water/Milk/Beans

water
water selected
Enter amount to fill (in ml):
1000
Added 1000 ml of water.

1
Please enter which type of Coffee you want 
Espresso - 4$/cup 
Latte - $7/cup 
Cappuccino - $6/cup 

Espresso
Here's your espresso. Enjoy your coffee!

1
Please enter which type of Coffee you want 
Espresso - 4$/cup 
Latte - $7/cup 
Cappuccino - $6/cup 

Latte
Apologies, but we don't have enough ingredients available to make an latte right now.

3
Money collected: $4

4
Ingredients available:
beans: 984 ml
milk: 0 ml
water: 750 ml

5
Coffee Sales Analytics:
espresso: 1 cups
Total earnings: $4


```

## Usage
1. Clone or download the repository.

2. Build and run the Java program using your preferred Java IDE or command-line tools.

3. Follow the prompts in the console to interact with the Coffee Machine Simulator.

## Requirements
Java Development Kit (JDK) 8 or later.
