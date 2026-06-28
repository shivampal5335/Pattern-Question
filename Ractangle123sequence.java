import java.util.Scanner;

public class Ractangle123sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the Row : ");
        int row = input.nextInt();

        System.out.println("enter the Columns : ");
        int Columns = input.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=Columns;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    
}
