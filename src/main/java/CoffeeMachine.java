import java.util.Scanner;

public class CoffeeMachine{
    private int cupNum = 0;

    // add a scanner
    Scanner input = new Scanner(System.in);

    // get the number of cups wanted for selected coffee
    public int getCups() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the desired number of cups of coffee: ");
        this.cupNum = input.nextInt();
        return this.cupNum;
    }
}
