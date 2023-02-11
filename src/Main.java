public class Main {
    public static void main(String[] args) {
        //Initialize Variables
        double itemCost = 99;
        double shippingCost = 0;
        double totalCost = 0;
        double totalShipped = 0;
            //If the item costs less than 100, add shipping cost.
            if (itemCost < 100) {
                shippingCost = itemCost * .2;
                //Add the shipping to the total
                totalCost = itemCost + shippingCost;
            } else {
                //Set totalCost to itemCost for the output.
                totalCost = itemCost;
            }
        //Output results
        System.out.println("Your shipping cost is $" + shippingCost + " and your total cost is $" + totalCost + ".");

    }
}
