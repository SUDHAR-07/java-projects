import java.util.*;

public class cinema {
	public static void main(String[] args) {
		Scanner susan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int a = susan.nextInt();
		System.out.println("Enter the number of seats in each row:");
		int b = susan.nextInt();
		String[][] theatre = new String[a][b];
			for(int i = 0; i < a; i++){
		    for(int j = 0; j <b;j++){
		        theatre[i][j] = "S";
		    }
		}
		int ticket = 0,current = 0, total = 0;
		if(a * b <= 60){
	            total = 10 * a * b;
	    } else if(a * b > 60){
	        total = 10 * (a/2);
	        total = total + (8 * (a - a/2));
	        total = total * b;
        }
		double percentage = 0;
		for(int i = 0; i < 1000; i ++) {
		    System.out.println();
		    System.out.println("1. Show the seats");
		    System.out.println("2. Buy a ticket");
		    System.out.println("3. Statistics");
		    System.out.println("0. Exit");
		    int k = susan.nextInt();
		    if(k == 0){
		        break;
		    } else if (k == 1){
		        print(a,b,theatre);
		    } else if (k == 2){
		         int rate = buy(a,b,theatre);
		         while(rate == 0){
		             rate = buy(a,b,theatre);
		         }
		         current += rate;
		         ticket ++;
		    } else if (k == 3){
		        percentage = (double)ticket / (double)(a * b) * 100;
		        System.out.println();
		        System.out.printf("Number of purchased tickets: %d\n",ticket);
		        System.out.printf("Percentage: %.2f", percentage);
		        System.out.print("%\n");
		        System.out.println("Current income: $" + current);
		        System.out.println("Total income: $" + total);
		    }
		}
	}
	public static int buy(int start,int end,String[][] theatre){
	    Scanner b = new Scanner(System.in);
	    System.out.println();
	    System.out.println("Enter a row number:");
	    int h = b.nextInt();
	    System.out.println("Enter a seat number in that row:");
	    int k = b.nextInt();
	    System.out.println();
        // Scanner.close();
	    int p = 0;
	    if(h > start || k > end){
	        p = 0;
	        System.out.println("Wrong input!");
	    } else if (theatre[h-1][k-1] == "B"){
	        p = 0;
	        System.out.println("That ticket has already been purchased!");
	    } else if (theatre[h-1][k-1] == "S"){
	        theatre[h-1][k-1] = "B";
	        if(start * end <= 60){
	            p = 10;
	            System.out.println("Ticket price: $10");
	        } else if(start * end > 60){
	            int d = start / 2;
	            // int sum = start - d;
	            if(h <= d){
	                p = 10;
	                System.out.println("Ticket price: $10");
	            } else if (h > d){
	                p = 8;
	                System.out.println("Ticket price: $8");
	            }
	        }
	    }
	    return p;
	}
	public static void print(int a, int b,String[][] theatre){
	    System.out.println();
        System.out.println("Cinema:");
	    System.out.print("  ");
		for(int i = 0; i < b; i++){
		    System.out.print(i+1 + " ");
		}
		System.out.println();
		for(int i = 0; i < a; i++){
		    System.out.print(i+1 + " ");
		    for(int j = 0; j <b;j++){
		        System.out.print(theatre[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}