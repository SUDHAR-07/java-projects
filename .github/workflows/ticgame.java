import java.util.*;

public class ticgame {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        String a = "         ";
        System.out.println("---------"); 
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|       |"); 
        System.out.println("---------"); 
        int[][] ar = new int[3][3];
        int c = 0;
        for (int  i = 0; i < 3; i++) {
            for (int j=  0; j < 3; j++) {
                ar[i][j] = a.charAt(c);
                c++;
            }
        }
        char[][] ans = new char[3][3];
         for(int i = 0; i < 3; i++) {
            for(int j=0; j < 3;j++) {
                ans[i][j]=(char)ar[i][j];
            }
        }
        int t = 0;
        int r = 0;
        int s = 0;
        int g = 0;
        while (t == 0) {
            System.out.print("Enter the coordinates:");
            var n = my.nextInt();
            var m = my.nextInt();
            if (n > 3 || m > 3) {    
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (n <= 3 && m <= 3) {
                if(ans[n-1][m-1] == 'X' || ans[n-1][m-1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                } else {
                    if (g % 2 == 0) {
                         ans[n-1][m-1] = 'X';
                         r = n;
                         s = m;
                    } else {
                        ans[n-1][m-1] = 'O';
                        r = n;
                        s = m;
                    }
                    g = g + 1;
                }
            } else {
                System.out.println("You should enter numbers!");       
            }
            System.out.println("---------");
            for(int i = 0; i < 3; i++) {
              System.out.println("| " + ans[i][0] + " " + ans[i][1] + " " + ans[i][2] + " |");
            }
            System.out.println("---------"); 
            int x = 0;
            int o = 0;
            int xno = 0;
            int ono = 0;
            for (int  i = 0; i < 3; i++) {
                for (int j=  0; j < 3; j++) {
                    if (ans[i][j] == 88) {
                        xno = xno + 1;
                    } else if (ans[i][j] == 79) {
                        ono = ono + 1;
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                if (ans[i][0] + ans[i][1] + ans[i][2] == 264) {
                   x = x + 1;
                } else if (ans[i][0] + ans[i][1] + ans[i][2] == 237) { 
                   o = o + 1;
                }
            }
            for (int j = 0; j < 3; j++) {
                if (ans[0][j] + ans[1][j] + ans[2][j] == 264) {
                   x = x + 1;
                } else if (ans[0][j] + ans[1][j] + ans[2][j] == 237) { 
                   o = o + 1;
                }
            }
            if (ans[0][0] + ans[1][1] + ans[2][2] == 264){
                x = x + 1;
            } else if (ans[0][0] + ans[1][1] + ans[2][2] == 237) {
                o = o + 1;
            }
            if (ans[0][2] + ans[1][1] + ans[2][0] == 264){
               x = x + 1;
            } else if (ans[0][2] + ans[1][1] + ans[2][0] == 237) {
               o = o + 1;
            }
            if (x > o) {
               System.out.println("X wins");
               t=t+1;
            } else if (o > x) {
               System.out.println("O wins");
               t=t+1;
            } else if (xno + ono == 9) {
               System.out.println("Draw");
               t=t+1;
        }
        // write your code here
        }
        // Scanner.close();
    }
}

