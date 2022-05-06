import java.util.Scanner;

public class FoodTransactions {
    public static Scanner order = new Scanner(System.in);
    
    private String itemName;
    private double itemPrice;
    private int fatContent;
    private int carbsContent;
    private int fiberContent;
    private int orderQty;

    public FoodTransactions(String itemName,double itemPrice, int fatContent,int carbsContent, int fiberContent,int orderQty){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.fatContent = fatContent;
        this.carbsContent = carbsContent;
        this.fiberContent = fiberContent;
        this.orderQty = orderQty;
    }

    public void showOrder(){
        System.out.println("Enter number of " + itemName + " : "); 
        int orderQty = order.nextInt();
        System.out.println("Each " + itemName + " has " + fatContent + " of fat " + carbsContent + " of carbs " + fiberContent + " of fiber.");
        this.orderQty += orderQty;  
    }

     public double priceCalculate(){
       double subTotal = 0;
        subTotal = this.itemPrice * this.orderQty;

         System.out.println("Output: " + this.itemPrice + "Output: " + subTotal);
        return subTotal;
      }

    
}
