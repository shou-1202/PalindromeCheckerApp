import java.util.Scanner;
public class PalindromeCheckerApp{
    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Checker App");
        String s1;
        Scanner input = new Scanner(System.in);
        s1 = input.nextLine();
        int i = 0, j = s1.length() - 1;
        int flag = 1;
        while(i<j){
            if(s1.charAt(i) != s1.charAt(j)) {
                flag = 0;
                break;
            }
            i++;
            j--;
        }
        if(flag==0){
            System.out.println("It is not a palindrome");
        }
        else{
            System.out.println("It is a palindrome");
        }
    }
}
