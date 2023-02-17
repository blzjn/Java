import java.util.Scanner;
import java.lang.*;

public class Frequency {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("The frequency is "+count);
    }
}
