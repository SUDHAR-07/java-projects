import java.util.*;

public class cofee {
    public static void main(String[] args) {
    Scanner susan = new Scanner(System.in);
    int water = 400,milk = 540,coffee =120,cup =9,money=550;
    for(int i = 0; i < 1000; i++)
    {
        System.out.println("Write action (buy, fill, take,remaining, exit):");
        // susan.nextLine();
        String g = susan.next();
        System.out.println();
        if(g.equals("remaining")){
            System.out.printf("The coffee machine has:\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d disposable cups\n$%d of money\n",water,milk,coffee,cup,money);
            System.out.println();
        }
        if(g.equals("buy")){
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            // int k = susan.nextInt();
            int k = 0;
            try{
                k = susan.nextInt();
            } catch (Exception e) {
                continue;
            }
            if(k==1){
                if(water >= 250 && coffee >= 16){
                    System.out.println("I have enough resources, making you a coffee!");
                    water = water - 250;
                    coffee = coffee - 16;
                    money = money + 4;
                    cup = cup - 1;
                    System.out.println();
                } else if (water < 250){
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                } else if (coffee < 16){
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                } 
            } else if (k ==2){
                if(water >= 350 && milk >= 75 && coffee >= 20){
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                    water = water - 350;
                    milk = milk - 75;
                    coffee = coffee - 20;
                    money = money + 7;
                    cup = cup - 1;
                } else if(water < 350){
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                } else if(milk < 75){
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                } else if (coffee < 20){
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                }
               // System.out.printf("The coffee machine has:\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d disposable cups\n$%d of money",water,milk,coffee,cup,money);
            } else if (k == 3){
                 if(water >= 200 && milk >= 100 && coffee >= 12){
                    System.out.println("I have enough resources, making you a coffee!");
                    System.out.println();
                    water = water - 200;
                    milk = milk - 100;
                    coffee = coffee - 12;
                    money = money + 6;
                    cup = cup - 1;
                } else if (water < 200){
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                } else if (milk < 100){
                    System.out.println("Sorry, not enough milk!");
                    System.out.println();
                } else if (coffee < 12){
                    System.out.println("Sorry, not enough coffee beans!");
                    System.out.println();
                }
               // System.out.printf("The coffee machine has:\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d disposable cups\n$%d of money",water,milk,coffee,cup,money);
            }
        }
        else if (g.equals("fill")){
            System.out.println("Write how many ml of water you want to add:");
            int wa = susan.nextInt();
            System.out.println("Write how many ml of milk you want to add:");
            int mi  = susan.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add:");
            int co  = susan.nextInt();
            System.out.println("Write how many cups of coffee you want to add:");
            int c  = susan.nextInt();
            System.out.println();
            water = water + wa;
            milk = milk + mi;
            coffee = co + coffee;
            cup= cup + c;
            // System.out.printf("The coffee machine has:\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d disposable cups\n$%d of money",water,milk,coffee,cup,money);
        } else if (g.equals("take")){
           System.out.println("I gave you $" + money);
           System.out.println();
           money = 0;
           //System.out.printf("The coffee machine has:\n%d ml of water\n%d ml of milk\n%d g of coffee beans\n%d disposable cups\n$%d of money",water,milk,coffee,cup,money);
        } else if(g.equals("exit")){
            break;
        }
    }
    susan.close();
}
}
