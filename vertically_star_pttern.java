import java.util.Scanner;

public class vertically_star_pttern {

    public static void main(String[]args){
          Scanner input = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j <= n - i) {
                    System.out.print("  ");   // Print spaces
                } else {
                    System.out.print("* ");   // Print stars
                }

            }

            System.out.println();
        }
    }

}