import java.util.Scanner;

public class Alphanumeric_Triangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Rows : ");
        int row =input.nextInt();

        for(int i=1;i<=row;i++){
            if(i%2==1){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                
            }
            else{
                for(int j=1;j<=i;j++){
                    System.out.print((char)(j+64)+" ");

                }
            }
            System.out.println();
        }
        
        
    }
}
