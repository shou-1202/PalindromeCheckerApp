import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp{
    public static void main(String[] args){
        String s1, s2="";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s1 = input.nextLine();
        char[] arr = s1.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c: arr){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            s2 += stack.pop();
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
