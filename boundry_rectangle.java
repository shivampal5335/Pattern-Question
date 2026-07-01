import java.util.Scanner;

public class boundry_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ROws : ");
        int n =input.nextInt();

        System.out.println("Coluums : ");
        int m = input.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }
    
}
