import java.util.Scanner;

public class App {
    public static Scanner order = new Scanner(System.in);

    public static FoodTransactions[] myOrders = new FoodTransactions[]{
        new FoodTransactions("Hamburger(s)",1.85,9,33,1,0),
        new FoodTransactions("Salad",2.00,1,11,5,0),
        new FoodTransactions("French Fries",1.30,11,36,4,0),
        new FoodTransactions("Soda",0.95,0,38,0,0)
    };


    public static void main(String[] args){
        display();
    }


    public static void display(){
       int total = 0;
        
        for(FoodTransactions myFood: myOrders){
            
              myFood.showOrder();
              total += myFood.priceCalculate();
            // System.out.println(myFood.showOrder());
        }
        System.out.println("Your order comes: " + total);
        
            display();
    }


}
