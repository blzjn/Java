import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Enter the row of first Matrix");
        Scanner sc = new Scanner(System.in);
        int m1=sc.nextInt();
        System.out.println("Enter the column of first Matrix");
        int n1=sc.nextInt();
        int mata[][]=new int[m1][n1];
        System.out.println("Enter the elements of first Matrix");
            for(int i=0;i<m1;i++){
                for(int j=0;j<n1;j++){
                    mata[i][j]=sc.nextInt();

                }
            }

        System.out.println("Enter the row of Second Matrix");
        int m2=sc.nextInt();
        System.out.println("Enter the column of Second Matrix");
        int n2=sc.nextInt();
        int matb[][]=new int[m2][n2];
        System.out.println("Enter the elements of Second Matrix");
            for(int i=0;i<m2;i++){
                for(int j=0;j<n2;j++){
                    matb[i][j]=sc.nextInt();

                }
            }
        sc.close();
        int result[][]=new int[m1][n2];
        
        if(n1!=m1){
            System.out.println("Matrix cannot be multiplied");

        }else{
       
        for(int i=0;i<m1;i++){
            for(int j=0;j<m2;j++){
                result[i][j]=0;
                for(int k=0;k<n2;k++){
                    result[i][j]+=mata[i][k]*matb[k][j];

                }
            }
        }
        System.out.println("The result is");

        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");

        }
    }
    }
}
