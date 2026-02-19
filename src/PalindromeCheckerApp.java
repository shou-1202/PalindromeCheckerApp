import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp{
    public static void main(String[] args){
        String s1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s1 = input.nextLine();
        char[] arr = s1.toCharArray();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for(char c: arr){
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while(!stack.isEmpty()){
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
