

public class Inventory extends CoffeeMachine{

    // declare variables
    private int mlWater = 5000,
            mlMilk = 2500,
            gCoffee = 750,
            baseMoney = 0,
            cups = 0;

    private final int cappuccinoWater = 200,
            cappuccinoMilk = 100,
            cappuccinoCoffee = 12,
            cappuccinoCost = 6,
            espressoWater = 250,
            espressoCoffee = 16,
            espressoCost = 4,
            latteWater = 350,
            latteMilk = 75,
            latteCoffee = 20,
            latteCost = 7;

    // set number of cups for selected coffee type
    public void setCup(int cup) {
        this.cups = cup;
    }

    // buy an espresso - calculate the cost and inventory usage and subtract that from inventory
    public void buyEspresso() {
        if (this.mlWater > (this.espressoWater * this.cups)&&this.gCoffee > (this.espressoCoffee * this.cups)) {
            int eWater = this.espressoWater * this.cups;
            this.mlWater = this.mlWater - eWater;
            int eCoffee = this.espressoCoffee * this.cups;
            this.gCoffee = this.gCoffee - eCoffee;
            int eCost = this.espressoCost * this.cups;
            this.baseMoney += eCost;

            // display brewing dialogue, inventory used and total cost of order
            System.out.println(" Starting to make a coffee \n Grinding coffee beans \n Boiling water \n Mixing boiled water with crushed coffee beans \n" +
                    " Pouring coffee into the cup \n Espresso is ready!");
            System.out.println("\n This order used : \n Water - " + eWater + "ml \n Coffee - " + eCoffee + "g \n Cost - $" + eCost);

        // if the machine does not have the inventory for the order display a message
        } else {
            System.out.println("This machine cannot produce that many cups.");
        }
    }
    // buy an latte - calculate the cost and inventory usage and subtract that from inventory
    public void buyLatte() {
        if (this.mlWater > (this.latteWater * this.cups)&&this.mlMilk > (this.latteMilk * this.cups)&&this.gCoffee > (this.latteCoffee * this.cups)) {
            int lWater = this.latteWater * this.cups;
            this.mlWater = this.mlWater - lWater;
            int lMilk = this.latteMilk * this.cups;
            this.mlMilk = this.mlMilk - lMilk;
            int lCoffee = this.latteCoffee * this.cups;
            this.gCoffee = this.gCoffee - lCoffee;
            int lCost = this.latteCost * this.cups;
            this.baseMoney += lCost;

            // display brewing dialogue, inventory used and total cost of order
            System.out.println(" Starting to make a coffee \n Grinding coffee beans \n Boiling water \n Mixing boiled water with crushed coffee beans \n" +
                    " Pouring coffee into the cup \n Pouring some milk into the cup \n Latte is ready!");
            System.out.println("\n This order used : \n Water - " + lWater + "ml \n Milk - " + lMilk + "ml \n Coffee - " + lCoffee + "g \n Cost - $" + lCost);

            // if the machine does not have the inventory for the order display a message
        } else {
            System.out.println("This machine cannot produce that many cups.");
        }
    }
    // buy an cappuccino - calculate the cost and inventory usage and subtract that from inventory
    public void buyCappuccino() {
        if (this.mlWater > (this.cappuccinoWater * this.cups)&&this.mlMilk > (this.cappuccinoMilk * this.cups)&&this.gCoffee > (this.cappuccinoCoffee * this.cups)) {
            int cWater = this.cappuccinoWater * this.cups;
            this.mlWater = this.mlWater - cWater;
            int cMilk = this.cappuccinoMilk * this.cups;
            this.mlMilk = this.mlMilk - cMilk;
            int cCoffee = this.cappuccinoCoffee * this.cups;
            this.gCoffee = this.gCoffee - cCoffee;
            int cCost = this.cappuccinoCost * this.cups;
            this.baseMoney += cCost;

            // display brewing dialogue, inventory used and total cost of order
            System.out.println(" Starting to make a coffee \n Grinding coffee beans \n Boiling water \n Mixing boiled water with crushed coffee beans \n" +
                    " Pouring coffee into the cup \n Pouring some milk into the cup \n Cappuccino is ready!");
            System.out.println("\n This order used : \n Water - " + cWater + "ml \n Milk - " + cMilk + "ml  \n Coffee - " + cCoffee + "g \n Cost - $" + cCost);

            // if the machine does not have the inventory for the order display a message
        } else {
            System.out.println("This machine cannot produce that many cups.");
        }
    }
    // add water to current inventory
    public void addWater(int amount){
        this.mlWater = amount + this.mlWater;
        System.out.println(amount + "ml water added. Current water level is: " + this.mlWater + "ml");
    }

    // add milk to current inventory
    public void addMilk(int amount){
        this.mlMilk = amount + this.mlMilk;
        System.out.println(amount + "ml milk added. Current milk level is: " + this.mlMilk + "ml");
    }

    // add coffee to current inventory
    public void addCoffee(int amount){
        this.gCoffee = amount + this.gCoffee;
        System.out.println(amount + "g coffee added. Current coffee level is: " + this.mlWater + "g");
    }

    //display how much money was in the machine and remove it all
    public void takeMoney(){
            System.out.println("You have withdrawn $" + this.baseMoney + ". There is currently $0 in the machine.");
            this.baseMoney = 0;
    }

    //display remaining inventory in the machine and how much money it current has
    public void remainingInv(){
        System.out.println("This machine's current inventory is: \n Water: " + this.mlWater +
                "ml \n Milk: " + this.mlMilk + "ml \n Coffee: " + this.gCoffee + "g \n Money: $" + this.baseMoney);

    }
}
