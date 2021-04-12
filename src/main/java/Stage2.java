import java.util.Scanner;

public class Stage2 {

    private int mlWater = 200, mlMilk = 50, gCoffee = 15, cupNum = 0;

    public void getCups() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the desired number of cups of coffee: ");
        this.cupNum = input.nextInt();
        
    }

    public String getWater(){

        int water = this.cupNum * this.mlWater;

        return water + "ml of water";

    }
    public String getMilk(){

        int milk= this.cupNum * this.mlMilk;

        return milk + "ml of milk";

    }
    public String getCoffee(){

        int coffee = this.cupNum * this.gCoffee;

        return coffee + "g of coffee";

    }


}
