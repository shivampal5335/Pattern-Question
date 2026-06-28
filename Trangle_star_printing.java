import java.util.Scanner;

/**
 * Trangle_star_printing
 */
public class Trangle_star_printing {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Rows : ");
        int rows=input.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}