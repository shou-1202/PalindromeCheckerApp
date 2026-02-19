import java.util.Scanner;
public class PalindromeCheckerApp{
    public static void main(String[] args){
        String s1,s2 = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s1 = input.nextLine();
        for(int i = s1.length()-1;i>=0; i--){
            s2 += s1.charAt(i);
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
