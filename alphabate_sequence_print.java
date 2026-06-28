import java.util.Scanner;

public class alphabate_sequence_print {
     public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.println("Rows");
        int rows =input.nextInt();

         System.out.println("Columns");
        int Columns =input.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=Columns;j++){
                System.out.print((char)(j+64)+" ");

            }
            System.out.println(" ");
        }
     }
}