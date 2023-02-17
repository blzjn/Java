import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        int len=item.length();

        int flag=1;
        for(int i=0;i<len;i++){

            if(item.charAt(i)!=item.charAt(len-1-i)){
                
               flag=0;
            }
                
            
            
        }
        if(flag==1){
            System.out.println("palindrome");

        }else{
            System.out.println("Not Palindrome");
        }
    }
}
