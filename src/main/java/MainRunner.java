import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {

        // set variables
        boolean end = false;
        int menuNum = 0;

        // instantiate CoffeeMachine and Inventory
        CoffeeMachine cm = new CoffeeMachine();
        Inventory inv = new Inventory();

        //add a scanner
        Scanner input = new Scanner(System.in);

        // loop while end is false
        while (end==false){

            //if nothing has been selected yet then menuNum = 0 - run main menu
            if (menuNum==0) {
                System.out.println("Please select one of the following options: \n 1. Buy \n 2. Fill \n 3. Take \n 4. Remaining \n 5. Exit");
                menuNum = input.nextInt();
            }
            // if selected run menu 1 - buy a coffee
            else if (menuNum==1) {
                System.out.println("Please select one of the following options: \n 1. Espresso \n 2. Latte \n 3. Cappuccino \n 4. Back to Main Menu");

                // select what kind of beverage
                int coffeeMenuNum = input.nextInt();

                // buy an espresso then return to main menu
                if(coffeeMenuNum==1){
                    inv.setCup(cm.getCups());
                    inv.buyEspresso();
                    menuNum = 0;
                }

                // buy an latte then return to main menu
                else if (coffeeMenuNum==2){
                    inv.setCup(cm.getCups());
                    inv.buyLatte();
                    menuNum = 0;
                }

                // buy an cappuccino then return to main menu
                else if (coffeeMenuNum==3){
                    inv.setCup(cm.getCups());
                    inv.buyCappuccino();
                    menuNum = 0;
                }
            }
            // menu 2 - Fill machine
            else if (menuNum==2) {
                System.out.println("Please select what you are filling: \n 1. Water \n 2. Milk \n 3. Coffee Beans \n 4. Fill All \n 5. Back to Main Menu");

                // select what to fill
                int fillSelect = input.nextInt();

                //fill water then return to main menu
                if (fillSelect == 1) {
                    System.out.println("How much water in millimeters are you adding? ");
                    int fillWater = input.nextInt();
                    inv.addWater(fillWater);
                    menuNum = 0;

                // fill milk then return to main menu
                } else if (fillSelect == 2) {
                    System.out.println("How much Milk in millimeters are you adding? ");
                    int fillMilk = input.nextInt();
                    inv.addMilk(fillMilk);
                    menuNum = 0;

                // fill coffee beans then return to main menu
                } else if (fillSelect == 3) {
                    System.out.println("How much water in grams are you adding? ");
                    int fillCoffee = input.nextInt();
                    inv.addCoffee(fillCoffee);
                    menuNum = 0;

                // fill all 3 then return to main menu
                } else if (fillSelect == 4) {
                    System.out.println("How much water in ml are you adding? ");
                    int fillWater = input.nextInt();
                    inv.addWater(fillWater);
                    System.out.println("How much Milk in millimeters are you adding? ");
                    int fillMilk = input.nextInt();
                    inv.addMilk(fillMilk);
                    System.out.println("How much water in grams are you adding? ");
                    int fillCoffee = input.nextInt();
                    inv.addCoffee(fillCoffee);
                    menuNum = 0;

                } else {
                    // if a number that is not on the list is selected go to main menu
                    menuNum = 0;

                }
            }
            // menu 3 - Take money from machine then return to main menu
            else if (menuNum==3) {
                inv.takeMoney();
                menuNum = 0;
            }
            // menu 4 - Show remaining inventory of machine then return to main menu
            else if (menuNum==4) {
                inv.remainingInv();
                menuNum = 0;
            }
            // exit program
            else if (menuNum==5) {
                end = true;
            }

        }

    }

}

