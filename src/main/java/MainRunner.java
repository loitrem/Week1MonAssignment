public class MainRunner {
    public static void main(String[] args) {

    Stage1 s1 = new Stage1();
    Stage2 s2 = new Stage2();

    for (int i=0; i<s1.output.length; i++){
            System.out.println(s1.output[i]);
        }


        s2.getCups();
        System.out.println(s2.getWater() + "\n" + s2.getMilk() + "\n" + s2.getCoffee());



    }
}
