import java.util.Scanner;
public class PalindromeCheckerApp{
    public static void main(String[] args){
        String s1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s1 = input.nextLine();
        char[] arr = s1.toCharArray();
        int start = 0, end = arr.length - 1;
        boolean isPalindrome = true;
        while(start<end){
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
