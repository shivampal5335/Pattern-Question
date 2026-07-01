import java.util.Scanner;

public class astrick_pattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the odd number : ");
        int n = input.nextInt();

        int middle = (n+1)/2;

        for(int i=1;i<=n;i++){
            for(int j = 1; j<=n;j++){
                if(i==j||i==middle||j==middle||i+j==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    
    }
}